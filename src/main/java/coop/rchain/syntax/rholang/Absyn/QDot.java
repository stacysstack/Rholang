package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class QDot extends Quantity {
  public final Quantity quantity_;
  public final String var_;
  public final ListQuantity listquantity_;
  public QDot(Quantity p1, String p2, ListQuantity p3) { quantity_ = p1; var_ = p2; listquantity_ = p3; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Quantity.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.QDot) {
      coop.rchain.syntax.rholang.Absyn.QDot x = (coop.rchain.syntax.rholang.Absyn.QDot)o;
      return this.quantity_.equals(x.quantity_) && this.var_.equals(x.var_) && this.listquantity_.equals(x.listquantity_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.quantity_.hashCode())+this.var_.hashCode())+this.listquantity_.hashCode();
  }


}
