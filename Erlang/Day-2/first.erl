fun(Languages, X) -> [Description || {Language, Description} <- Languages, Language == X] end.

%fun(Languages, X) -> lists:filter(fun({Lang, Desc}) -> Lang == X end, Languages) end.