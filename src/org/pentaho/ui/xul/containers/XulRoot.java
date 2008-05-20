package org.pentaho.ui.xul.containers;

import org.pentaho.ui.xul.XulContainer;
import org.pentaho.ui.xul.XulDomContainer;

public interface XulRoot extends XulContainer{
  
  /**
   * This is the event that gets fired once the 
   * XUL parser and loader have completed their work. 
   */
  public static final int EVENT_ON_LOAD = 555;

  /**
   * Sets the title of the application window.
   * @param title The application's title text. 
   */
  public void setTitle(String title);
  
  /**
   * 
   * @return the title
   */
  public String getTitle();

  /**
   *  
   * @return The width of this root object. 
   */
  public int getWidth();

  /**
   * 
   * @param width The width of this root object.
   */
  public void setWidth(int width);

  /**
   * 
   * @return The height of this root object. 
   */
  public int getHeight();
  
  /**
   * 
   * @param The height of this root object.
   */
  public void setHeight(int height);

  /**
   * Creates a reference to the DOM container that will be managing this window and its events.
   * @param xulDomContainer the container holding this document. 
   */
  public void setXulDomContainer(XulDomContainer xulDomContainer);
  
  /**
   * 
   * @return the DOM container managing this document. 
   */
  public XulDomContainer getXulDomContainer();
  
  /**
   * Sets the method name to invoke during the onload event 
   * for this window.
   *  
   * @param onload The method name, in the form of [handlerId.medthodName()].
   */
  public void setOnload(String onload);
  
  /**
   * 
   * @return The method string used for the onload event. 
   */
  public String getOnload();


}