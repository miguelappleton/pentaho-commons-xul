package org.pentaho.ui.xul.swt.tags;

import java.util.ArrayList;
import java.util.List;

import org.pentaho.ui.xul.XulComponent;
import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.containers.XulTree;
import org.pentaho.ui.xul.containers.XulTreeChildren;
import org.pentaho.ui.xul.containers.XulTreeItem;
import org.pentaho.ui.xul.containers.XulTreeRow;
import org.pentaho.ui.xul.swt.SwtElement;

public class SwtTreeChildren extends SwtElement implements XulTreeChildren {

  protected XulTree parentTree = null;
  
  protected List <XulTreeItem> items;
  
  private boolean alternateBackgroundColors = false;
  
  public SwtTreeChildren(XulComponent parent){
    this(parent, null, "treechildren");
  }
  
  public SwtTreeChildren(XulComponent parent, XulDomContainer container, String tagName) {
    super(tagName);
    
    parentTree = (XulTree)parent;
    items = new ArrayList <XulTreeItem>();
    
    parentTree.setRootChildren(this);
    
  }
  
  public void addItem(XulTreeItem item){
    items.add(item);
  }
  
  public boolean isHierarchical(){
    return parentTree.isHierarchical();
  }
  
  public XulTree getTree(){
    return parentTree;
  }
  
  public boolean isAlternatingbackground() {
    return alternateBackgroundColors;
  }

  public void setAlternatingbackground(boolean alt) {
    alternateBackgroundColors = alt;
  }

  public XulTreeRow addNewRow(){
    SwtTreeItem item = new SwtTreeItem(this);
    item.setRow(new SwtTreeRow(item));
    return item.getRow();
  }

  public XulTreeItem getItem(int rowIndex) {
    return items.get(rowIndex);
  }

}