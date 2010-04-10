package org.intrace.output;

import java.util.Map;

/**
 * Output generated by the instrumentation
 */
public interface IOutput
{
  public void enter(String className, String methodName, int lineNo);

  public void arg(String className, String methodName, byte byteArg);
  public void arg(String className, String methodName, byte[] byteArrayArg);
  public void arg(String className, String methodName, short shortArg);
  public void arg(String className, String methodName, short[] shortArrayArg);

  public void arg(String className, String methodName, int intArg);
  public void arg(String className, String methodName, int[] intArrayArg);
  public void arg(String className, String methodName, long longArg);
  public void arg(String className, String methodName, long[] longArrayArg);

  public void arg(String className, String methodName, float floatArg);
  public void arg(String className, String methodName, float[] floatArrayArg);
  public void arg(String className, String methodName, double doubleArg);
  public void arg(String className, String methodName, double[] doubleArrayArg);

  public void arg(String className, String methodName, boolean boolArg);
  public void arg(String className, String methodName, boolean[] boolArrayArg);
  public void arg(String className, String methodName, char charArg);
  public void arg(String className, String methodName, char[] charArrayArg);

  public void arg(String className, String methodName, Object objArg);
  public void arg(String className, String methodName, Object[] objArrayArg);

  public void branch(String className, String methodName, int lineNo);
  public void exit(String className, String methodName, int lineNo);

  public String getResponse(String args);
  public Map<String,String> getSettingsMap();
}
