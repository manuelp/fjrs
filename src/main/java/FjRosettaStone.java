import com.googlecode.totallylazy.Callable1;
import com.googlecode.totallylazy.Callable2;
import com.googlecode.totallylazy.Callable3;
import com.googlecode.totallylazy.Callable4;
import fj.*;
import fj.function.Try1;
import fj.function.Try2;
import fj.function.Try3;
import fj.function.Try4;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;

/**
 * Conversions across function types of:
 * <ul>
 *   <li><a href="http://www.functionaljava.org/">Functional Java</a></li>
 *   <li><a href="https://github.com/ReactiveX/RxJava">RxJava</a></li>
 *   <li><a href="http://totallylazy.com/">TotallyLazy</a></li>
 * </ul>
 */
public class FjRosettaStone {
  /**
   * Conversions from Functional Java and TotallyLazy to RxJava ones.
   */
  public static class RxJava {
    public static <A, B> Func1<A, B> toFunc1(final F<A, B> f) {
      return new Func1<A, B>() {
        @Override
        public B call(A a) {
          return f.f(a);
        }
      };
    }

    public static <A, B, C> Func2<A, B, C> toFunc2(final F2<A, B, C> f) {
      return new Func2<A, B, C>() {
        @Override
        public C call(A a, B b) {
          return f.f(a, b);
        }
      };
    }

    public static <A, B, C, D> Func3<A, B, C, D> toFunc3(final F3<A, B, C, D> f) {
      return new Func3<A, B, C, D>() {
        @Override
        public D call(A a, B b, C c) {
          return f.f(a, b, c);
        }
      };
    }

    public static <A, B, C, D, E> Func4<A, B, C, D, E> toFunc4(final F4<A, B, C, D, E> f) {
      return new Func4<A, B, C, D, E>() {
        @Override
        public E call(A a, B b, C c, D d) {
          return f.f(a, b, c, d);
        }
      };
    }

    public static <A, B> Func1<A, B> toFunc1(final Callable1<A, B> f) {
      return new Func1<A, B>() {
        @Override
        public B call(A a) {
          try {
            return f.call(a);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      };
    }

    public static <A, B, C> Func2<A, B, C> toFunc2(final Callable2<A, B, C> f) {
      return new Func2<A, B, C>() {
        @Override
        public C call(A a, B b) {
          try {
            return f.call(a, b);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      };
    }

    public static <A, B, C, D> Func3<A, B, C, D> toFunc3(final Callable3<A, B, C, D> f) {
      return new Func3<A, B, C, D>() {
        @Override
        public D call(A a, B b, C c) {
          try {
            return f.call(a, b, c);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      };
    }

    public static <A, B, C, D, E> Func4<A, B, C, D, E> toFunc4(final Callable4<A, B, C, D, E> f) {
      return new Func4<A, B, C, D, E>() {
        @Override
        public E call(A a, B b, C c, D d) {
          try {
            return f.call(a, b, c, d);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      };
    }
  }

  /**
   * Conversions from RxJava and TotallyLazy functions to Function Java ones.
   */
  public static class FJ {
    public static <A, B> F<A, B> toF(final Func1<A, B> f) {
      return new F<A, B>() {
        @Override
        public B f(A a) {
          return f.call(a);
        }
      };
    }

    public static <A, B, C> F2<A, B, C> toF2(final Func2<A, B, C> f) {
      return new F2<A, B, C>() {
        @Override
        public C f(A a, B b) {
          return f.call(a, b);
        }
      };
    }

    public static <A, B, C, D> F3<A, B, C, D> toF3(final Func3<A, B, C, D> f) {
      return new F3<A, B, C, D>() {
        @Override
        public D f(A a, B b, C c) {
          return f.call(a, b, c);
        }
      };
    }

    public static <A, B, C, D, E> F4<A, B, C, D, E> toF4(final Func4<A, B, C, D, E> f) {
      return new F4<A, B, C, D, E>() {
        @Override
        public E f(A a, B b, C c, D d) {
          return f.call(a, b, c, d);
        }
      };
    }

    public static <A, B> F<A, B> toF(final Callable1<A, B> f) {
      return new F<A, B>() {
        @Override
        public B f(A a) {
          try {
            return f.call(a);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      };
    }

    public static <A, B, C> F2<A, B, C> toF2(final Callable2<A, B, C> f) {
      return new F2<A, B, C>() {
        @Override
        public C f(A a, B b) {
          try {
            return f.call(a, b);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      };
    }

    public static <A, B, C, D> F3<A, B, C, D> toF3(final Callable3<A, B, C, D> f) {
      return new F3<A, B, C, D>() {
        @Override
        public D f(A a, B b, C c) {
          try {
            return f.call(a, b, c);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      };
    }

    public static <A, B, C, D, E> F4<A, B, C, D, E> toF4(final Callable4<A, B, C, D, E> f) {
      return new F4<A, B, C, D, E>() {
        @Override
        public E f(A a, B b, C c, D d) {
          try {
            return f.call(a, b, c, d);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      };
    }

    public static <A, B> Try1<A, B, Exception> toTry1(final Callable1<A, B> f) {
      return new Try1<A, B, Exception>() {
        @Override
        public B f(A a) throws Exception {
          return f.call(a);
        }
      };
    }

    public static <A, B, C> Try2<A, B, C, Exception> toTry2(final Callable2<A, B, C> f) {
      return new Try2<A, B, C, Exception>() {
        @Override
        public C f(A a, B b) throws Exception {
          return f.call(a, b);
        }
      };
    }

    public static <A, B, C, D> Try3<A, B, C, D, Exception> toTry3(final Callable3<A, B, C, D> f) {
      return new Try3<A, B, C, D, Exception>() {
        @Override
        public D f(A a, B b, C c) throws Exception {
          return f.call(a, b, c);
        }
      };
    }

    public static <A, B, C, D, E> Try4<A, B, C, D, E, Exception> toTry4(final Callable4<A, B, C, D, E> f) {
      return new Try4<A, B, C, D, E, Exception>() {
        @Override
        public E f(A a, B b, C c, D d) throws Exception {
          return f.call(a, b, c, d);
        }
      };
    }
  }
}
