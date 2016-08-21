Build from Source:
1. Go to Source Directory.
2. Install maven.
3. mvn clean package.
4. Get Jar from target folder


Using jar:
1.java -jar kefim-1.0-jar-with-dependencies.jar -k [int--size-of-k] -i [string-path--input-file] -o [string-path--output-file] -sup [boolean--activate-subtree-pruning] -tm [boolean--activate-transaction-merging] -c [int--maximum-transactions]
2. Output Itemsets in output file and stats printed on console.
