package converter;

import com.sun.istack.internal.Nullable;

public interface Converter<S, T> {

	@Nullable
	T convert(S source);
}
