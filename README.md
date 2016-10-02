# AsyncAndNIO
This is a repository to store examples of Servlet 3.0 (Async) and 3.1 (Non-blocking NIO) samples.

---
NIO
---

Java NIO Channels are similar to streams with a few differences:

You can both read and write to a Channels. Streams are typically one-way (read or write).
Channels can be read and written asynchronously.
Channels always read to, or write from, a Buffer.

Here are the most important Channel implementations in Java NIO:

- FileChannel: reads data from and to files.
- DatagramChannel: read and write data over the network via UDP.
- SocketChannel: read and write data over the network via TCP.
- ServerSocketChannel: allows you to listen for incoming TCP connections, like a web server does. For each incoming connection a SocketChannel is created.

A Selector is a Java NIO component which can examine one or more NIO Channel's, and determine which channels are ready 
for e.g. reading or writing. This way a single thread can manage multiple channels, and thus multiple network connections.
