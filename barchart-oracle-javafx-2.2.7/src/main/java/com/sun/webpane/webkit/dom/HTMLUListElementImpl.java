/*    */ package com.sun.webpane.webkit.dom;
/*    */ 
/*    */ import org.w3c.dom.html.HTMLUListElement;
/*    */ 
/*    */ public class HTMLUListElementImpl extends HTMLElementImpl
/*    */   implements HTMLUListElement
/*    */ {
/*    */   HTMLUListElementImpl(long peer, long contextPeer, long rootPeer)
/*    */   {
/*  9 */     super(peer, contextPeer, rootPeer);
/*    */   }
/*    */ 
/*    */   static HTMLUListElement getImpl(long peer, long contextPeer, long rootPeer) {
/* 13 */     return (HTMLUListElement)create(peer, contextPeer, rootPeer);
/*    */   }
/*    */ 
/*    */   public boolean getCompact()
/*    */   {
/* 19 */     return getCompactImpl(getPeer());
/*    */   }
/*    */   static native boolean getCompactImpl(long paramLong);
/*    */ 
/*    */   public void setCompact(boolean value) {
/* 24 */     setCompactImpl(getPeer(), value);
/*    */   }
/*    */   static native void setCompactImpl(long paramLong, boolean paramBoolean);
/*    */ 
/*    */   public String getType() {
/* 29 */     return getTypeImpl(getPeer());
/*    */   }
/*    */   static native String getTypeImpl(long paramLong);
/*    */ 
/*    */   public void setType(String value) {
/* 34 */     setTypeImpl(getPeer(), value);
/*    */   }
/*    */ 
/*    */   static native void setTypeImpl(long paramLong, String paramString);
/*    */ }

/* Location:           /home/user1/Temp/jfxrt/jfxrt.jar
 * Qualified Name:     com.sun.webpane.webkit.dom.HTMLUListElementImpl
 * JD-Core Version:    0.6.2
 */