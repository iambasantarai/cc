function mapper(text) {
  const keyValuePairs = [];
  const words = text.split(/\s+/);
  for (const word of words) {
    keyValuePairs.push([word, 1]);
  }
  return keyValuePairs;
}

function reducer(keyValuePairs) {
  const word = keyValuePairs[0];
  const counts = keyValuePairs[1];
  const total = counts.reduce((sum, count) => sum + count, 0);
  return [word, total];
}

function mapreduce(data) {
  const keyValuePairs = {};
  const lines = data.split("\n");
  for (const line of lines) {
    const mappedPairs = mapper(line);
    for (const [word, count] of mappedPairs) {
      if (!keyValuePairs[word]) {
        keyValuePairs[word] = [];
      }
      keyValuePairs[word].push(count);
    }
  }
  const results = [];
  for (const [word, counts] of Object.entries(keyValuePairs)) {
    results.push(reducer([word, counts]));
  }
  return results;
}

const data = prompt();

const results = mapreduce(data);
for (const [word, count] of results) {
  console.log(`Word: ${word}, Count: ${count}`);
}
