---
title: Presentation on "Distributed Database Systems & Architecture"
sub_title: (Advance Database)
author: Basanta Rai
theme:
  name: dark
---

# What is Distributed Database System ?

- A distributed database system is a collection of multiple interconnected databases spread across various locations that appear to the user as a single, coherent system.
- In modern computing, distributed databases are crucial for handling large volumes of data and ensuring high availability.

**Key Features:** Distribution, Transparency, Concurrency Control, Fault Tolerance.

<!-- end_slide -->

# Types of Distributed Database system

- Homogeneous Distributed Database System
- Heterogeneous Distributed Database System

<!-- end_slide -->

## Homogeneous Distributed Database System

- Consist of multiple databases of the same type (e.g., all Oracle databases)
- Databases are aware of each others and agree to co-operate to process the user queries
- All databases use the same DBMS software and have similar hardware configurations, ensuring uniformity
- **Example:** Oracle Real Application Clusters (RAC)
  - Oracle RAC allows multiple instances to access a single database concurrently, providing high availability and scalability by distributing workload across nodes.
  - It ensures data consistency and fault tolerance through shared storage and cache fusion technology.

<!-- end_slide -->

## Heterogeneous Distributed Database System

- Includes databases from different vendors
- Databases may not be aware of each others
- Requires middleware to provide a uniform interface to the applications
- **Example:** Distributed databases integrating Oracle, SQL Server, and MongoDB, Middleware-based Integration
  - JDBC (Java Database Connectivity) and ODBC (Open Database Connectivity) are middleware technologies that enable applications to interact with various databases through a common interface.
  - They provide drivers and APIs for connecting to different databases, allowing seamless integration and data access across heterogeneous environments.

<!-- end_slide -->

# Distributed Database Architecture

- Replication Database Architecture
- Partitioned Database Architecture
- Federated Database Architecture
- Hierarchial Database Architecture
- Cloud Database Architecture

<!-- end_slide -->

## Replication Architecture

- Replicated database architecture involves maintaining copies of the entire database or its parts across multiple nodes or locations.
- Updates made to one copy are propagated to all other copies, ensuring redundancy and fault tolerance.

### Advantages

- high availability
- fault tolerance
- improved read performance
- resilience against node failures.

### Challenges

Synchronization overhead, consistency maintenance, and potential for data conflicts.

### Example

Content delivery networks (CDNs), real-time analytics systems, and distributed cache systems.

<!-- end_slide -->

## Partitioned Database Architecture

- Partitioned database architecture, also known as sharding, involves dividing the database into smaller partitions or shards distributed across multiple nodes.
- Each node is responsible for storing and managing a subset of data.

### Advantages

- scalability
- improved performance and efficient resource utilization

### Challenges

Data distribution and balancing, complexity in managing distributed queries and transactions.

### Example

Social media platforms, e-commerce websites, and large-scale online gaming platforms.

<!-- end_slide -->

## Federated Database Architecture

- Federated database architecture integrates multiple autonomous databases into a single logical database.
- Each database retains its autonomy, and a middleware layer provides a unified view to users and applications.

### Advantages

- heterogeneous data source integration
- data independence and flexibility.

### Challenges

Complex data integration, query optimization across distributed sources, and potential for inconsistency.

### Example

Enterprise resource planning (ERP) systems, data warehousing, and global supply chain management.

<!-- end_slide -->

## Hierarchial Database Architecture

- Hierarchical database architecture organizes databases in a hierarchical structure with a centralized database at the top and subsidiary databases at lower levels.
- Data flows from the top down, and each level manages its subset of data.

### Advantages

- simple data organization
- clear hierarchical structure
- centralized control.

### Challenges

Limited scalability, potential for bottlenecks at the central database, and lack of flexibility.

### Example

Organizational databases in hierarchical companies, directory services, and network.

<!-- end_slide -->

## Cloud Database Architecture

- Cloud database architecture leverages cloud computing resources to deploy and manage distributed databases.
- Cloud providers offer scalable infrastructure and services for storage, processing, and management of data across distributed environments.

### Advantages

- flexibility
- scalability
- cost-effectiveness
- accessibility.

### Challenges

Security concerns, data privacy, and performance variability.

### Example

Software as a Service (SaaS) applications, cloud-native applications, and big data analytics platforms.

<!-- end_slide -->

# References

- [Distributed Database Architecture](https://www.filibeto.org/sun/lib/nonsun/oracle/11.1.0.6.0/B28359_01/server.111/b28310/ds_concepts001.htm#i1007639)
- [Distributed Database Architecture in DBMS](https://www.javatpoint.com/distributed-database-architecture-in-dbms)
- [Distributed Database System](https://www.geeksforgeeks.org/distributed-database-system/)

<!-- end_slide -->

# Thank you
