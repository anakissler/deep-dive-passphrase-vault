package edu.cnm.deepdive.passphrase.ui;

import edu.cnm.deepdive.passphrase.util.Constants;
import edu.cnm.deepdive.passphrase.Options;
import java.util.HashMap;
import java.util.Map;

//TODO - Write main method as a test rig for Options class.

public class CommandLine {

  public static void main(String[] args) {

    try {
      Options options = new Options(args);
      Map<String, Object> map = options.map;

      for (Map.Entry<String, Object> entry : map.entrySet()) {
        System.out.printf("%s = %s%n", entry.getKey(), entry.getValue());
      }
      boolean passwordMode = map.containsKey(Constants.PASSWORD_MODE_OPTION);
      if (passwordMode) {
        for (String key : map.keySet()) {
          switch (key) {
            // TODO - invoke setters on password generator
            case Constants.EXCLUDES_REPEAT:
              System.out.println("User specified no repeat characters.");
              break;
            case Constants.EXCLUDES_UPPERCASE:
              System.out.println("User specified no uppercase.");
              break;
            case Constants.EXCLUDES_LOWERCASE:
              System.out.println("User specified no lowercase.");
              break;
            case Constants.EXCLUDES_DIGITS:
              System.out.println("User specified no digits.");
              break;
            case Constants.EXCLUDES_AMBIGUOUS:
              System.out.println("User specified no ambiguous characters.");
              break;
            case Constants.EXCLUDES_ORDER:
              System.out.println("User specified no order characters.");
              break;
            case Constants.EXCLUDES_SYMBOLS:
              System.out.println("User specified no symbols.");
              break;
            case Constants.SPECIFY_LENGTH:
              System.out.println("User specified length.");
              break;
          }

        }
      } else {
        //passphrase mode
        for (String key : map.keySet()) {
          switch (key) {
            // TODO - invoke setters on password generator
            case Constants.NO_REPEAT_OPTION:
              System.out.println("User specified no repeat words.");
              break;
            case Constants.SPECIFY_LENGTH:
              System.out.println("User specified length.");
              break;
            case Constants.SPECIFY_DELIMITER:
              System.out.println("User specified delimiter.");
              break;
          }
        }
      }
    } catch (Exception ex) {
      System.exit(-1);
    }


  }
}















































//package edu.cnm.deepdive.passphrase.ui;
//
//import org.apache.commons.cli.CommandLineParser;
//import org.apache.commons.cli.DefaultParser;
//import org.apache.commons.cli.HelpFormatter;
//import org.apache.commons.cli.Option;
//import org.apache.commons.cli.Options;
//import org.apache.commons.cli.ParseException;
//
//
//
//public class CommandLine {
//
//
//  public static void main(String[] args) {
//    try {
//      Options options = buildOptions(); //"edu.cnm.deepdive.passphrase.Options" is the instance and "options" is the type...just Java speak.
//      CommandLineParser parser = new DefaultParser();
//      org.apache.commons.cli.CommandLine cmdLine = parser.parse(options, args);
//      if (cmdLine.hasOption("?")) {
//        HelpFormatter formatter = new HelpFormatter();
//        formatter.printHelp("java" + CommandLine.class.getName(), options);
//      }
//    } catch (ParseException e) {
//      e.printStackTrace();
//    }
//
//  }
//
//  private static Options buildOptions() {
//    Option sampleOpt = Option.builder("s").argName("value") //fluent style instead of saying builder.argName("value);
//                                               .optionalArg(true)
//                                               .longOpt("sample")
//                                               .desc("Silly description")
//                                               .required()
//                                               .hasArg(true)
//                                               .numberOfArgs(1)
//                                               .type(Number.class)
//                                               .build(); //has to be at the end and what we get out of it at the end is an "option"
//    Option repeatOpt = Option.builder("r").hasArg(false)
//                                               .longOpt("no-repeat")
//                                               .desc("excludes repeated characters or words")
//                                               .build();
//    Option switchOpt = Option.builder("x").hasArg(false)
//                                               .longOpt("exclude")
//                                               .desc("Another description")
//                                               .build();
//    Option helpOpt =   Option.builder("?").longOpt("help")
//                                               .required(false)
//                                               .hasArg(false)
//                                               .desc("Display this screen")
//                                               .build();
//    Options options = new Options();
//    options.addOption(sampleOpt);
//    options.addOption(repeatOpt);
//    options.addOption(switchOpt);
//    options.addOption(helpOpt);
//    return options;
//
//  }
//}
