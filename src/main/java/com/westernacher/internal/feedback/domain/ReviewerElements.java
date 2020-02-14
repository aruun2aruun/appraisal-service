package com.westernacher.internal.feedback.domain;

import lombok.Data;

@Data
public class ReviewerElements {
    private String comment;
    private String rating;
    private String name;
    private boolean isComplete;
}
