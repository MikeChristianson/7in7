musician(daft_punk, synth).
musician(daft_punk, samples).
musician(kristian_dunn, doublekneck_guitar).
musician(kristian_dunn, fretless_bass).
musician(tom_petty, guitar).
musician(john_bonham, drums).
musician(neil_peart, drums).

genre(daft_punk, electronic).
genre(daft_punk, house).
genre(kristian_dunn, post-rock).
genre(tom_petty, rock).
genre(tom_petty, classic-rock).
genre(john_bonham, rock).
genre(neil_peart, rock).

who_plays_what(X, Y) :- musician(X, Y).