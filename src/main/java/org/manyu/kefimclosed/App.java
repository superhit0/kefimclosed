package org.manyu.kefimclosed;

import org.apache.commons.cli.*;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AlgoKEFIMClosed obj =new AlgoKEFIMClosed();
        CommandLine commandLine;
        Options options = new Options();
        CommandLineParser parser = new DefaultParser();
        options.addOption("i", true, "get input file");
        options.addOption("o", true, "get output file");
        options.addOption("k", true, "get K");
        options.addOption("tm", true, "set transaction merging");
        options.addOption("c", true, "get transaction count");
        options.addOption("sup", true, "set subtree utility pruning");
        options.addOption("acp",true,"set closed pattern jump");
        int k=100;
        String inputPath="mushroom.txt";
        String outputPath="abc.txt";
        boolean activateTransactionMerging=true;
        int maximumTransactionCount=8124;
        boolean activateSubtreeUtilityPruning=true;
        boolean activateClosedPatternJump=true;
        try {
            commandLine=parser.parse(options,args);
            k=Integer.parseInt(commandLine.getOptionValue("k"));
            inputPath=commandLine.getOptionValue("i");
            outputPath=commandLine.getOptionValue("o");
            maximumTransactionCount=Integer.parseInt(commandLine.getOptionValue("c"));
            activateSubtreeUtilityPruning=Boolean.parseBoolean(commandLine.getOptionValue("sup"));
            activateTransactionMerging=Boolean.parseBoolean(commandLine.getOptionValue("tm"));
            activateClosedPatternJump=Boolean.parseBoolean(commandLine.getOptionValue("acp"));
            obj.runAlgorithm(k,1,inputPath,outputPath,activateTransactionMerging,maximumTransactionCount,activateSubtreeUtilityPruning,activateClosedPatternJump);
            obj.printStats();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
