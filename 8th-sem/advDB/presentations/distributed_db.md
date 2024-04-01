---
title: Presentation on "Types of Distributed Database Systems & Distributed Database Architecture"
sub_title: (Advance Database)
author: Basanta Rai
theme:
  name: dark
---

# What is Distributed Database System ?

A distributed database system is a collection of multiple interconnected databases spread across various locations that appear to the user as a single, coherent system.

**Key Features:** Distribution, Transparency, Concurrency Control, Fault Tolerance.

<!-- end_slide -->

# Types of Distributed Database system

- Homogeneous Distributed Database System
- Heterogeneous Distributed Database System
- Federated Database System

<!-- end_slide -->

## Homogeneous Distributed Database System

- Consist of multiple databases of the same type (e.g., all Oracle databases)
- Databases are aware of each others
- Agree to co-operate to process the user queries
- All databases use the same DBMS software, ensuring uniformity
- **Example:** Oracle Real Application Clusters (RAC)

<!-- end_slide -->

## Heterogeneous Distributed Database System

- Includes databases from different vendors
- Databases may not be aware of each others
- Requires middleware to provide a uniform interface to the applications
- **Example:** Distributed databases integrating Oracle, SQL Server, and MongoDB

<!-- end_slide -->

## Federated Database System

- Integrates multiple autonomous and possibly heterogeneous databases into a single logical view
- Each component database retains its autonomy and data model
- **Example:** IBM DB2 Federation, Microsoft SQL Server Data Virtualization

<!-- end_slide -->

# Distributed Database Architecture

- Client-Server Architecture
- Peer-to-Peer Architecture
- Multi-tier Architecture
- Replication Architecture
- Hybrid Architectures

<!-- end_slide -->

## Client-Servery Architecture

- Clients interact with a centralized server that manages data storage and processing
- Centralized server handles data management and processing requests from multiple clients
- **Example:** MySQL Cluster, PostgreSQL streaming replication.

## Peer-to-Peer Architecture

- All nodes in the network act as both clients and servers, sharing data and processing.
- Each node can initiate data transactions and communicate with other nodes directly.
- **Example:** BitTorrent, Bitcoin blockchain.

<!-- end_slide -->

## Multi-tier Architecture

- Divides the database system into multiple layers or tiers, each performing specific functions.
- Typically consists of a presentation tier, application tier, and data tier.

## Replication Architecture

- Data is duplicated across multiple nodes to improve availability and performance.
- Updates to one node are propagated to other nodes to maintain consistency.
- **Example:** Master-Slave replication, Peer-to-Peer replication.

## Hybrid Architectures

- Combines multiple architectural approaches to meet specific requirements.
- Utilizes elements of client-server, peer-to-peer, and other architectures as needed.

<!-- end_slide -->

# References

- [Distributed Database Architecture](https://www.filibeto.org/sun/lib/nonsun/oracle/11.1.0.6.0/B28359_01/server.111/b28310/ds_concepts001.htm#i1007639)
- [Distributed Database Architecture in DBMS](https://www.javatpoint.com/distributed-database-architecture-in-dbms)
- [Distributed Database System](https://www.geeksforgeeks.org/distributed-database-system/)

<!-- end_slide -->

# Thank you
