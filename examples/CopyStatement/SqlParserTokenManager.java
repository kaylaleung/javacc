/* SqlParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. SqlParserTokenManager.java */
import java.util.ArrayList;
import java.util.HashMap;

/** Token Manager. */
@SuppressWarnings ("unused")
public class SqlParserTokenManager implements SqlParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 5;
         return jjMoveNfa_0(0, 0);
      case 10:
         jjmatchedKind = 2;
         return jjMoveNfa_0(0, 0);
      case 13:
         jjmatchedKind = 1;
         return jjMoveStringLiteralDfa1_0(0x8L);
      case 32:
         jjmatchedKind = 6;
         return jjMoveNfa_0(0, 0);
      case 40:
         jjmatchedKind = 11;
         return jjMoveNfa_0(0, 0);
      case 41:
         jjmatchedKind = 12;
         return jjMoveNfa_0(0, 0);
      case 44:
         jjmatchedKind = 14;
         return jjMoveNfa_0(0, 0);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x8100L);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 81:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x30000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 92:
         jjmatchedKind = 4;
         return jjMoveNfa_0(0, 0);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x8100L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 113:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x30000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 0);
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x8L) != 0L)
         {
            jjmatchedKind = 3;
            jjmatchedPos = 1;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x800200L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 79:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x8080L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 83:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x30000L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x800200L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 111:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x8080L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x30000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 1);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 68:
         return jjMoveStringLiteralDfa3_0(active0, 0x30000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x840000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x80100L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x30000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x840000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x80100L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 2);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 68:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 72:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         break;
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x810000L);
      case 76:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         break;
      case 77:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 79:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 89:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 3;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 104:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x810000L);
      case 108:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         break;
      case 109:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 121:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 3;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 3);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 69:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 77:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 78:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 4;
         }
         break;
      case 80:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 85:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 101:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 110:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 4;
         }
         break;
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 4);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 5;
         }
         break;
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 82:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 5;
         }
         break;
      case 84:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 5;
         }
         break;
      case 101:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 5;
         }
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 114:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 5;
         }
         break;
      case 116:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 5);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 5);
   }
   switch(curChar)
   {
      case 84:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 6);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 6);
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 7);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 7);
   }
   switch(curChar)
   {
      case 82:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 8;
         }
         break;
      case 114:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 8;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 8);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 36;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar == 35)
                     { jjCheckNAddTwoStates(21, 22); }
                  else if (curChar == 39)
                     { jjCheckNAdd(19); }
                  else if (curChar == 48)
                  {
                     if (kind > 22)
                        kind = 22;
                  }
                  else if (curChar == 49)
                  {
                     if (kind > 21)
                        kind = 21;
                  }
                  break;
               case 6:
                  if (curChar == 48 && kind > 22)
                     kind = 22;
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 18:
                  if (curChar == 39)
                     { jjCheckNAdd(19); }
                  break;
               case 19:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(19, 20); }
                  break;
               case 20:
                  if (curChar == 39 && kind > 26)
                     kind = 26;
                  break;
               case 21:
                  if (curChar == 35)
                     { jjCheckNAddTwoStates(21, 22); }
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 24:
                  if (curChar != 35)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(24); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     { jjCheckNAdd(17); }
                  }
                  if ((0x800000008000L & l) != 0L)
                     { jjAddStates(3, 4); }
                  else if ((0x10000000100000L & l) != 0L)
                     { jjAddStates(5, 6); }
                  else if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 1:
                  if ((0x2000000020L & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 2:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 7:
                  if ((0x40000000400000L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 8:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0x200000002000000L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 11:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
               case 17:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAdd(17); }
                  break;
               case 19:
                  { jjAddStates(7, 8); }
                  break;
               case 22:
               case 23:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 25:
                  if ((0x10000000100000L & l) != 0L)
                     { jjAddStates(5, 6); }
                  break;
               case 26:
                  if ((0x2000000020L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 27:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if ((0x10000000100000L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 30:
                  if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if ((0x800000008000L & l) != 0L)
                     { jjAddStates(3, 4); }
                  break;
               case 33:
                  if ((0x400000004000L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 34:
                  if ((0x4000000040L & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 35:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(7, 8); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 36 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, "\50", "\51", 
null, "\54", null, null, null, null, null, null, null, null, null, null, null, null, 
null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   22, 23, 24, 33, 35, 28, 31, 19, 20, 
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public SqlParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public SqlParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 36; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7ffff81L, 
};
static final long[] jjtoSkip = {
   0x800007eL, 
};
static final long[] jjtoSpecial = {
   0x8000000L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[36];
    private final int[] jjstateSet = new int[2 * 36];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
