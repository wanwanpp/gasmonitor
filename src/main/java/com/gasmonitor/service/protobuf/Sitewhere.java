package com.gasmonitor.service.protobuf;

public final class Sitewhere {
    private Sitewhere() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface ModelOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code Model}
     *
     * <pre>
     * Model Objects
     * </pre>
     */
    public static final class Model extends
            com.google.protobuf.GeneratedMessage
            implements ModelOrBuilder {
        // Use Model.newBuilder() to construct.
        private Model(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Model(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Model defaultInstance;
        public static Model getDefaultInstance() {
            return defaultInstance;
        }

        public Model getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Model(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Sitewhere.internal_static_Model_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Sitewhere.internal_static_Model_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Sitewhere.Model.class, Sitewhere.Model.Builder.class);
        }

        public static com.google.protobuf.Parser<Model> PARSER =
                new com.google.protobuf.AbstractParser<Model>() {
                    public Model parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Model(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<Model> getParserForType() {
            return PARSER;
        }

        public interface MetadataOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string name = 1;
            /**
             * <code>required string name = 1;</code>
             */
            boolean hasName();
            /**
             * <code>required string name = 1;</code>
             */
            java.lang.String getName();
            /**
             * <code>required string name = 1;</code>
             */
            com.google.protobuf.ByteString
            getNameBytes();

            // required string value = 2;
            /**
             * <code>required string value = 2;</code>
             */
            boolean hasValue();
            /**
             * <code>required string value = 2;</code>
             */
            java.lang.String getValue();
            /**
             * <code>required string value = 2;</code>
             */
            com.google.protobuf.ByteString
            getValueBytes();
        }
        /**
         * Protobuf type {@code Model.Metadata}
         *
         * <pre>
         * A single piece of metadata.
         * </pre>
         */
        public static final class Metadata extends
                com.google.protobuf.GeneratedMessage
                implements MetadataOrBuilder {
            // Use Metadata.newBuilder() to construct.
            private Metadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private Metadata(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final Metadata defaultInstance;
            public static Metadata getDefaultInstance() {
                return defaultInstance;
            }

            public Metadata getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private Metadata(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                name_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                value_ = input.readBytes();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Model_Metadata_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Model_Metadata_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Model.Metadata.class, Sitewhere.Model.Metadata.Builder.class);
            }

            public static com.google.protobuf.Parser<Metadata> PARSER =
                    new com.google.protobuf.AbstractParser<Metadata>() {
                        public Metadata parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new Metadata(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<Metadata> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string name = 1;
            public static final int NAME_FIELD_NUMBER = 1;
            private java.lang.Object name_;
            /**
             * <code>required string name = 1;</code>
             */
            public boolean hasName() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string name = 1;</code>
             */
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        name_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string name = 1;</code>
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required string value = 2;
            public static final int VALUE_FIELD_NUMBER = 2;
            private java.lang.Object value_;
            /**
             * <code>required string value = 2;</code>
             */
            public boolean hasValue() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string value = 2;</code>
             */
            public java.lang.String getValue() {
                java.lang.Object ref = value_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        value_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string value = 2;</code>
             */
            public com.google.protobuf.ByteString
            getValueBytes() {
                java.lang.Object ref = value_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    value_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private void initFields() {
                name_ = "";
                value_ = "";
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasName()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasValue()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getNameBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getValueBytes());
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getNameBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getValueBytes());
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Model.Metadata parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.Metadata parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.Metadata parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.Metadata parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.Metadata parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.Metadata parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.Metadata parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Model.Metadata parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.Metadata parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.Metadata parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Model.Metadata prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Model.Metadata}
             *
             * <pre>
             * A single piece of metadata.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Model.MetadataOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Model_Metadata_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Model_Metadata_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Model.Metadata.class, Sitewhere.Model.Metadata.Builder.class);
                }

                // Construct using Sitewhere.Model.Metadata.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    name_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    value_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Model_Metadata_descriptor;
                }

                public Sitewhere.Model.Metadata getDefaultInstanceForType() {
                    return Sitewhere.Model.Metadata.getDefaultInstance();
                }

                public Sitewhere.Model.Metadata build() {
                    Sitewhere.Model.Metadata result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Model.Metadata buildPartial() {
                    Sitewhere.Model.Metadata result = new Sitewhere.Model.Metadata(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.name_ = name_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.value_ = value_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Model.Metadata) {
                        return mergeFrom((Sitewhere.Model.Metadata)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Model.Metadata other) {
                    if (other == Sitewhere.Model.Metadata.getDefaultInstance()) return this;
                    if (other.hasName()) {
                        bitField0_ |= 0x00000001;
                        name_ = other.name_;
                        onChanged();
                    }
                    if (other.hasValue()) {
                        bitField0_ |= 0x00000002;
                        value_ = other.value_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasName()) {

                        return false;
                    }
                    if (!hasValue()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Model.Metadata parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Model.Metadata) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string name = 1;
                private java.lang.Object name_ = "";
                /**
                 * <code>required string name = 1;</code>
                 */
                public boolean hasName() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string name = 1;</code>
                 */
                public java.lang.String getName() {
                    java.lang.Object ref = name_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        name_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string name = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getNameBytes() {
                    java.lang.Object ref = name_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        name_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string name = 1;</code>
                 */
                public Builder setName(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    name_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string name = 1;</code>
                 */
                public Builder clearName() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    name_ = getDefaultInstance().getName();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string name = 1;</code>
                 */
                public Builder setNameBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    name_ = value;
                    onChanged();
                    return this;
                }

                // required string value = 2;
                private java.lang.Object value_ = "";
                /**
                 * <code>required string value = 2;</code>
                 */
                public boolean hasValue() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required string value = 2;</code>
                 */
                public java.lang.String getValue() {
                    java.lang.Object ref = value_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        value_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string value = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getValueBytes() {
                    java.lang.Object ref = value_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        value_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string value = 2;</code>
                 */
                public Builder setValue(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    value_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string value = 2;</code>
                 */
                public Builder clearValue() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    value_ = getDefaultInstance().getValue();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string value = 2;</code>
                 */
                public Builder setValueBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    value_ = value;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:Model.Metadata)
            }

            static {
                defaultInstance = new Metadata(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Model.Metadata)
        }

        public interface DeviceLocationOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string hardwareId = 1;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            boolean hasHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            java.lang.String getHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            com.google.protobuf.ByteString
            getHardwareIdBytes();

            // required double latitude = 2;
            /**
             * <code>required double latitude = 2;</code>
             */
            boolean hasLatitude();
            /**
             * <code>required double latitude = 2;</code>
             */
            double getLatitude();

            // required double longitude = 3;
            /**
             * <code>required double longitude = 3;</code>
             */
            boolean hasLongitude();
            /**
             * <code>required double longitude = 3;</code>
             */
            double getLongitude();

            // optional double elevation = 4;
            /**
             * <code>optional double elevation = 4;</code>
             */
            boolean hasElevation();
            /**
             * <code>optional double elevation = 4;</code>
             */
            double getElevation();

            // optional fixed64 eventDate = 5;
            /**
             * <code>optional fixed64 eventDate = 5;</code>
             */
            boolean hasEventDate();
            /**
             * <code>optional fixed64 eventDate = 5;</code>
             */
            long getEventDate();

            // repeated .Model.Metadata metadata = 6;
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            java.util.List<Sitewhere.Model.Metadata>
            getMetadataList();
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            Sitewhere.Model.Metadata getMetadata(int index);
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            int getMetadataCount();
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList();
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index);

            // optional bool updateState = 7;
            /**
             * <code>optional bool updateState = 7;</code>
             */
            boolean hasUpdateState();
            /**
             * <code>optional bool updateState = 7;</code>
             */
            boolean getUpdateState();
        }
        /**
         * Protobuf type {@code Model.DeviceLocation}
         *
         * <pre>
         * Report device location.
         * </pre>
         */
        public static final class DeviceLocation extends
                com.google.protobuf.GeneratedMessage
                implements DeviceLocationOrBuilder {
            // Use DeviceLocation.newBuilder() to construct.
            private DeviceLocation(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private DeviceLocation(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final DeviceLocation defaultInstance;
            public static DeviceLocation getDefaultInstance() {
                return defaultInstance;
            }

            public DeviceLocation getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private DeviceLocation(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                hardwareId_ = input.readBytes();
                                break;
                            }
                            case 17: {
                                bitField0_ |= 0x00000002;
                                latitude_ = input.readDouble();
                                break;
                            }
                            case 25: {
                                bitField0_ |= 0x00000004;
                                longitude_ = input.readDouble();
                                break;
                            }
                            case 33: {
                                bitField0_ |= 0x00000008;
                                elevation_ = input.readDouble();
                                break;
                            }
                            case 41: {
                                bitField0_ |= 0x00000010;
                                eventDate_ = input.readFixed64();
                                break;
                            }
                            case 50: {
                                if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                                    metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>();
                                    mutable_bitField0_ |= 0x00000020;
                                }
                                metadata_.add(input.readMessage(Sitewhere.Model.Metadata.PARSER, extensionRegistry));
                                break;
                            }
                            case 56: {
                                bitField0_ |= 0x00000020;
                                updateState_ = input.readBool();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                        metadata_ = java.util.Collections.unmodifiableList(metadata_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Model_DeviceLocation_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Model_DeviceLocation_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Model.DeviceLocation.class, Sitewhere.Model.DeviceLocation.Builder.class);
            }

            public static com.google.protobuf.Parser<DeviceLocation> PARSER =
                    new com.google.protobuf.AbstractParser<DeviceLocation>() {
                        public DeviceLocation parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new DeviceLocation(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<DeviceLocation> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string hardwareId = 1;
            public static final int HARDWAREID_FIELD_NUMBER = 1;
            private java.lang.Object hardwareId_;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public boolean hasHardwareId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public java.lang.String getHardwareId() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        hardwareId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getHardwareIdBytes() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hardwareId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required double latitude = 2;
            public static final int LATITUDE_FIELD_NUMBER = 2;
            private double latitude_;
            /**
             * <code>required double latitude = 2;</code>
             */
            public boolean hasLatitude() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required double latitude = 2;</code>
             */
            public double getLatitude() {
                return latitude_;
            }

            // required double longitude = 3;
            public static final int LONGITUDE_FIELD_NUMBER = 3;
            private double longitude_;
            /**
             * <code>required double longitude = 3;</code>
             */
            public boolean hasLongitude() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required double longitude = 3;</code>
             */
            public double getLongitude() {
                return longitude_;
            }

            // optional double elevation = 4;
            public static final int ELEVATION_FIELD_NUMBER = 4;
            private double elevation_;
            /**
             * <code>optional double elevation = 4;</code>
             */
            public boolean hasElevation() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional double elevation = 4;</code>
             */
            public double getElevation() {
                return elevation_;
            }

            // optional fixed64 eventDate = 5;
            public static final int EVENTDATE_FIELD_NUMBER = 5;
            private long eventDate_;
            /**
             * <code>optional fixed64 eventDate = 5;</code>
             */
            public boolean hasEventDate() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional fixed64 eventDate = 5;</code>
             */
            public long getEventDate() {
                return eventDate_;
            }

            // repeated .Model.Metadata metadata = 6;
            public static final int METADATA_FIELD_NUMBER = 6;
            private java.util.List<Sitewhere.Model.Metadata> metadata_;
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public int getMetadataCount() {
                return metadata_.size();
            }
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public Sitewhere.Model.Metadata getMetadata(int index) {
                return metadata_.get(index);
            }
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index) {
                return metadata_.get(index);
            }

            // optional bool updateState = 7;
            public static final int UPDATESTATE_FIELD_NUMBER = 7;
            private boolean updateState_;
            /**
             * <code>optional bool updateState = 7;</code>
             */
            public boolean hasUpdateState() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional bool updateState = 7;</code>
             */
            public boolean getUpdateState() {
                return updateState_;
            }

            private void initFields() {
                hardwareId_ = "";
                latitude_ = 0D;
                longitude_ = 0D;
                elevation_ = 0D;
                eventDate_ = 0L;
                metadata_ = java.util.Collections.emptyList();
                updateState_ = false;
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasHardwareId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasLatitude()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasLongitude()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                for (int i = 0; i < getMetadataCount(); i++) {
                    if (!getMetadata(i).isInitialized()) {
                        memoizedIsInitialized = 0;
                        return false;
                    }
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeDouble(2, latitude_);
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeDouble(3, longitude_);
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    output.writeDouble(4, elevation_);
                }
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    output.writeFixed64(5, eventDate_);
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    output.writeMessage(6, metadata_.get(i));
                }
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                    output.writeBool(7, updateState_);
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(2, latitude_);
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(3, longitude_);
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(4, elevation_);
                }
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeFixed64Size(5, eventDate_);
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(6, metadata_.get(i));
                }
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBoolSize(7, updateState_);
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Model.DeviceLocation parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceLocation parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceLocation parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceLocation parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceLocation parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceLocation parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceLocation parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Model.DeviceLocation parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceLocation parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceLocation parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Model.DeviceLocation prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Model.DeviceLocation}
             *
             * <pre>
             * Report device location.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Model.DeviceLocationOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Model_DeviceLocation_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Model_DeviceLocation_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Model.DeviceLocation.class, Sitewhere.Model.DeviceLocation.Builder.class);
                }

                // Construct using Sitewhere.Model.DeviceLocation.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                        getMetadataFieldBuilder();
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    hardwareId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    latitude_ = 0D;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    longitude_ = 0D;
                    bitField0_ = (bitField0_ & ~0x00000004);
                    elevation_ = 0D;
                    bitField0_ = (bitField0_ & ~0x00000008);
                    eventDate_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000010);
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000020);
                    } else {
                        metadataBuilder_.clear();
                    }
                    updateState_ = false;
                    bitField0_ = (bitField0_ & ~0x00000040);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Model_DeviceLocation_descriptor;
                }

                public Sitewhere.Model.DeviceLocation getDefaultInstanceForType() {
                    return Sitewhere.Model.DeviceLocation.getDefaultInstance();
                }

                public Sitewhere.Model.DeviceLocation build() {
                    Sitewhere.Model.DeviceLocation result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Model.DeviceLocation buildPartial() {
                    Sitewhere.Model.DeviceLocation result = new Sitewhere.Model.DeviceLocation(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.hardwareId_ = hardwareId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.latitude_ = latitude_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.longitude_ = longitude_;
                    if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                        to_bitField0_ |= 0x00000008;
                    }
                    result.elevation_ = elevation_;
                    if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                        to_bitField0_ |= 0x00000010;
                    }
                    result.eventDate_ = eventDate_;
                    if (metadataBuilder_ == null) {
                        if (((bitField0_ & 0x00000020) == 0x00000020)) {
                            metadata_ = java.util.Collections.unmodifiableList(metadata_);
                            bitField0_ = (bitField0_ & ~0x00000020);
                        }
                        result.metadata_ = metadata_;
                    } else {
                        result.metadata_ = metadataBuilder_.build();
                    }
                    if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                        to_bitField0_ |= 0x00000020;
                    }
                    result.updateState_ = updateState_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Model.DeviceLocation) {
                        return mergeFrom((Sitewhere.Model.DeviceLocation)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Model.DeviceLocation other) {
                    if (other == Sitewhere.Model.DeviceLocation.getDefaultInstance()) return this;
                    if (other.hasHardwareId()) {
                        bitField0_ |= 0x00000001;
                        hardwareId_ = other.hardwareId_;
                        onChanged();
                    }
                    if (other.hasLatitude()) {
                        setLatitude(other.getLatitude());
                    }
                    if (other.hasLongitude()) {
                        setLongitude(other.getLongitude());
                    }
                    if (other.hasElevation()) {
                        setElevation(other.getElevation());
                    }
                    if (other.hasEventDate()) {
                        setEventDate(other.getEventDate());
                    }
                    if (metadataBuilder_ == null) {
                        if (!other.metadata_.isEmpty()) {
                            if (metadata_.isEmpty()) {
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000020);
                            } else {
                                ensureMetadataIsMutable();
                                metadata_.addAll(other.metadata_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.metadata_.isEmpty()) {
                            if (metadataBuilder_.isEmpty()) {
                                metadataBuilder_.dispose();
                                metadataBuilder_ = null;
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000020);
                                metadataBuilder_ =
                                        com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                                getMetadataFieldBuilder() : null;
                            } else {
                                metadataBuilder_.addAllMessages(other.metadata_);
                            }
                        }
                    }
                    if (other.hasUpdateState()) {
                        setUpdateState(other.getUpdateState());
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasHardwareId()) {

                        return false;
                    }
                    if (!hasLatitude()) {

                        return false;
                    }
                    if (!hasLongitude()) {

                        return false;
                    }
                    for (int i = 0; i < getMetadataCount(); i++) {
                        if (!getMetadata(i).isInitialized()) {

                            return false;
                        }
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Model.DeviceLocation parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Model.DeviceLocation) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string hardwareId = 1;
                private java.lang.Object hardwareId_ = "";
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public boolean hasHardwareId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public java.lang.String getHardwareId() {
                    java.lang.Object ref = hardwareId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        hardwareId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getHardwareIdBytes() {
                    java.lang.Object ref = hardwareId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        hardwareId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder clearHardwareId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    hardwareId_ = getDefaultInstance().getHardwareId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }

                // required double latitude = 2;
                private double latitude_ ;
                /**
                 * <code>required double latitude = 2;</code>
                 */
                public boolean hasLatitude() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required double latitude = 2;</code>
                 */
                public double getLatitude() {
                    return latitude_;
                }
                /**
                 * <code>required double latitude = 2;</code>
                 */
                public Builder setLatitude(double value) {
                    bitField0_ |= 0x00000002;
                    latitude_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required double latitude = 2;</code>
                 */
                public Builder clearLatitude() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    latitude_ = 0D;
                    onChanged();
                    return this;
                }

                // required double longitude = 3;
                private double longitude_ ;
                /**
                 * <code>required double longitude = 3;</code>
                 */
                public boolean hasLongitude() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>required double longitude = 3;</code>
                 */
                public double getLongitude() {
                    return longitude_;
                }
                /**
                 * <code>required double longitude = 3;</code>
                 */
                public Builder setLongitude(double value) {
                    bitField0_ |= 0x00000004;
                    longitude_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required double longitude = 3;</code>
                 */
                public Builder clearLongitude() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    longitude_ = 0D;
                    onChanged();
                    return this;
                }

                // optional double elevation = 4;
                private double elevation_ ;
                /**
                 * <code>optional double elevation = 4;</code>
                 */
                public boolean hasElevation() {
                    return ((bitField0_ & 0x00000008) == 0x00000008);
                }
                /**
                 * <code>optional double elevation = 4;</code>
                 */
                public double getElevation() {
                    return elevation_;
                }
                /**
                 * <code>optional double elevation = 4;</code>
                 */
                public Builder setElevation(double value) {
                    bitField0_ |= 0x00000008;
                    elevation_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional double elevation = 4;</code>
                 */
                public Builder clearElevation() {
                    bitField0_ = (bitField0_ & ~0x00000008);
                    elevation_ = 0D;
                    onChanged();
                    return this;
                }

                // optional fixed64 eventDate = 5;
                private long eventDate_ ;
                /**
                 * <code>optional fixed64 eventDate = 5;</code>
                 */
                public boolean hasEventDate() {
                    return ((bitField0_ & 0x00000010) == 0x00000010);
                }
                /**
                 * <code>optional fixed64 eventDate = 5;</code>
                 */
                public long getEventDate() {
                    return eventDate_;
                }
                /**
                 * <code>optional fixed64 eventDate = 5;</code>
                 */
                public Builder setEventDate(long value) {
                    bitField0_ |= 0x00000010;
                    eventDate_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional fixed64 eventDate = 5;</code>
                 */
                public Builder clearEventDate() {
                    bitField0_ = (bitField0_ & ~0x00000010);
                    eventDate_ = 0L;
                    onChanged();
                    return this;
                }

                // repeated .Model.Metadata metadata = 6;
                private java.util.List<Sitewhere.Model.Metadata> metadata_ =
                        java.util.Collections.emptyList();
                private void ensureMetadataIsMutable() {
                    if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                        metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>(metadata_);
                        bitField0_ |= 0x00000020;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder> metadataBuilder_;

                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                    if (metadataBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(metadata_);
                    } else {
                        return metadataBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public int getMetadataCount() {
                    if (metadataBuilder_ == null) {
                        return metadata_.size();
                    } else {
                        return metadataBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.Metadata getMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);
                    } else {
                        return metadataBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.set(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addMetadata(Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addMetadata(
                        Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addAllMetadata(
                        java.lang.Iterable<? extends Sitewhere.Model.Metadata> values) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        super.addAll(values, metadata_);
                        onChanged();
                    } else {
                        metadataBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder clearMetadata() {
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000020);
                        onChanged();
                    } else {
                        metadataBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder removeMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.remove(index);
                        onChanged();
                    } else {
                        metadataBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.Metadata.Builder getMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                        int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);  } else {
                        return metadataBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
                getMetadataOrBuilderList() {
                    if (metadataBuilder_ != null) {
                        return metadataBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(metadata_);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder() {
                    return getMetadataFieldBuilder().addBuilder(
                            Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().addBuilder(
                            index, Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata.Builder>
                getMetadataBuilderList() {
                    return getMetadataFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>
                getMetadataFieldBuilder() {
                    if (metadataBuilder_ == null) {
                        metadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                                Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>(
                                metadata_,
                                ((bitField0_ & 0x00000020) == 0x00000020),
                                getParentForChildren(),
                                isClean());
                        metadata_ = null;
                    }
                    return metadataBuilder_;
                }

                // optional bool updateState = 7;
                private boolean updateState_ ;
                /**
                 * <code>optional bool updateState = 7;</code>
                 */
                public boolean hasUpdateState() {
                    return ((bitField0_ & 0x00000040) == 0x00000040);
                }
                /**
                 * <code>optional bool updateState = 7;</code>
                 */
                public boolean getUpdateState() {
                    return updateState_;
                }
                /**
                 * <code>optional bool updateState = 7;</code>
                 */
                public Builder setUpdateState(boolean value) {
                    bitField0_ |= 0x00000040;
                    updateState_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional bool updateState = 7;</code>
                 */
                public Builder clearUpdateState() {
                    bitField0_ = (bitField0_ & ~0x00000040);
                    updateState_ = false;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:Model.DeviceLocation)
            }

            static {
                defaultInstance = new DeviceLocation(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Model.DeviceLocation)
        }

        public interface DeviceAlertOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string hardwareId = 1;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            boolean hasHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            java.lang.String getHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            com.google.protobuf.ByteString
            getHardwareIdBytes();

            // required string alertType = 2;
            /**
             * <code>required string alertType = 2;</code>
             */
            boolean hasAlertType();
            /**
             * <code>required string alertType = 2;</code>
             */
            java.lang.String getAlertType();
            /**
             * <code>required string alertType = 2;</code>
             */
            com.google.protobuf.ByteString
            getAlertTypeBytes();

            // required string alertMessage = 3;
            /**
             * <code>required string alertMessage = 3;</code>
             */
            boolean hasAlertMessage();
            /**
             * <code>required string alertMessage = 3;</code>
             */
            java.lang.String getAlertMessage();
            /**
             * <code>required string alertMessage = 3;</code>
             */
            com.google.protobuf.ByteString
            getAlertMessageBytes();

            // optional fixed64 eventDate = 4;
            /**
             * <code>optional fixed64 eventDate = 4;</code>
             */
            boolean hasEventDate();
            /**
             * <code>optional fixed64 eventDate = 4;</code>
             */
            long getEventDate();

            // repeated .Model.Metadata metadata = 5;
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            java.util.List<Sitewhere.Model.Metadata>
            getMetadataList();
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            Sitewhere.Model.Metadata getMetadata(int index);
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            int getMetadataCount();
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList();
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index);

            // optional bool updateState = 6;
            /**
             * <code>optional bool updateState = 6;</code>
             */
            boolean hasUpdateState();
            /**
             * <code>optional bool updateState = 6;</code>
             */
            boolean getUpdateState();
        }
        /**
         * Protobuf type {@code Model.DeviceAlert}
         *
         * <pre>
         * Report device alert.
         * </pre>
         */
        public static final class DeviceAlert extends
                com.google.protobuf.GeneratedMessage
                implements DeviceAlertOrBuilder {
            // Use DeviceAlert.newBuilder() to construct.
            private DeviceAlert(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private DeviceAlert(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final DeviceAlert defaultInstance;
            public static DeviceAlert getDefaultInstance() {
                return defaultInstance;
            }

            public DeviceAlert getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private DeviceAlert(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                hardwareId_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                alertType_ = input.readBytes();
                                break;
                            }
                            case 26: {
                                bitField0_ |= 0x00000004;
                                alertMessage_ = input.readBytes();
                                break;
                            }
                            case 33: {
                                bitField0_ |= 0x00000008;
                                eventDate_ = input.readFixed64();
                                break;
                            }
                            case 42: {
                                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                                    metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>();
                                    mutable_bitField0_ |= 0x00000010;
                                }
                                metadata_.add(input.readMessage(Sitewhere.Model.Metadata.PARSER, extensionRegistry));
                                break;
                            }
                            case 48: {
                                bitField0_ |= 0x00000010;
                                updateState_ = input.readBool();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                        metadata_ = java.util.Collections.unmodifiableList(metadata_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Model_DeviceAlert_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Model_DeviceAlert_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Model.DeviceAlert.class, Sitewhere.Model.DeviceAlert.Builder.class);
            }

            public static com.google.protobuf.Parser<DeviceAlert> PARSER =
                    new com.google.protobuf.AbstractParser<DeviceAlert>() {
                        public DeviceAlert parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new DeviceAlert(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<DeviceAlert> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string hardwareId = 1;
            public static final int HARDWAREID_FIELD_NUMBER = 1;
            private java.lang.Object hardwareId_;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public boolean hasHardwareId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public java.lang.String getHardwareId() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        hardwareId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getHardwareIdBytes() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hardwareId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required string alertType = 2;
            public static final int ALERTTYPE_FIELD_NUMBER = 2;
            private java.lang.Object alertType_;
            /**
             * <code>required string alertType = 2;</code>
             */
            public boolean hasAlertType() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string alertType = 2;</code>
             */
            public java.lang.String getAlertType() {
                java.lang.Object ref = alertType_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        alertType_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string alertType = 2;</code>
             */
            public com.google.protobuf.ByteString
            getAlertTypeBytes() {
                java.lang.Object ref = alertType_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    alertType_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required string alertMessage = 3;
            public static final int ALERTMESSAGE_FIELD_NUMBER = 3;
            private java.lang.Object alertMessage_;
            /**
             * <code>required string alertMessage = 3;</code>
             */
            public boolean hasAlertMessage() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required string alertMessage = 3;</code>
             */
            public java.lang.String getAlertMessage() {
                java.lang.Object ref = alertMessage_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        alertMessage_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string alertMessage = 3;</code>
             */
            public com.google.protobuf.ByteString
            getAlertMessageBytes() {
                java.lang.Object ref = alertMessage_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    alertMessage_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // optional fixed64 eventDate = 4;
            public static final int EVENTDATE_FIELD_NUMBER = 4;
            private long eventDate_;
            /**
             * <code>optional fixed64 eventDate = 4;</code>
             */
            public boolean hasEventDate() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional fixed64 eventDate = 4;</code>
             */
            public long getEventDate() {
                return eventDate_;
            }

            // repeated .Model.Metadata metadata = 5;
            public static final int METADATA_FIELD_NUMBER = 5;
            private java.util.List<Sitewhere.Model.Metadata> metadata_;
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            public int getMetadataCount() {
                return metadata_.size();
            }
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            public Sitewhere.Model.Metadata getMetadata(int index) {
                return metadata_.get(index);
            }
            /**
             * <code>repeated .Model.Metadata metadata = 5;</code>
             */
            public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index) {
                return metadata_.get(index);
            }

            // optional bool updateState = 6;
            public static final int UPDATESTATE_FIELD_NUMBER = 6;
            private boolean updateState_;
            /**
             * <code>optional bool updateState = 6;</code>
             */
            public boolean hasUpdateState() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional bool updateState = 6;</code>
             */
            public boolean getUpdateState() {
                return updateState_;
            }

            private void initFields() {
                hardwareId_ = "";
                alertType_ = "";
                alertMessage_ = "";
                eventDate_ = 0L;
                metadata_ = java.util.Collections.emptyList();
                updateState_ = false;
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasHardwareId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasAlertType()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasAlertMessage()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                for (int i = 0; i < getMetadataCount(); i++) {
                    if (!getMetadata(i).isInitialized()) {
                        memoizedIsInitialized = 0;
                        return false;
                    }
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getAlertTypeBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeBytes(3, getAlertMessageBytes());
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    output.writeFixed64(4, eventDate_);
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    output.writeMessage(5, metadata_.get(i));
                }
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    output.writeBool(6, updateState_);
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getAlertTypeBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(3, getAlertMessageBytes());
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeFixed64Size(4, eventDate_);
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(5, metadata_.get(i));
                }
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBoolSize(6, updateState_);
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Model.DeviceAlert parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceAlert parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceAlert parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceAlert parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceAlert parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceAlert parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceAlert parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Model.DeviceAlert parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceAlert parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceAlert parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Model.DeviceAlert prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Model.DeviceAlert}
             *
             * <pre>
             * Report device alert.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Model.DeviceAlertOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Model_DeviceAlert_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Model_DeviceAlert_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Model.DeviceAlert.class, Sitewhere.Model.DeviceAlert.Builder.class);
                }

                // Construct using Sitewhere.Model.DeviceAlert.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                        getMetadataFieldBuilder();
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    hardwareId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    alertType_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    alertMessage_ = "";
                    bitField0_ = (bitField0_ & ~0x00000004);
                    eventDate_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000008);
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000010);
                    } else {
                        metadataBuilder_.clear();
                    }
                    updateState_ = false;
                    bitField0_ = (bitField0_ & ~0x00000020);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Model_DeviceAlert_descriptor;
                }

                public Sitewhere.Model.DeviceAlert getDefaultInstanceForType() {
                    return Sitewhere.Model.DeviceAlert.getDefaultInstance();
                }

                public Sitewhere.Model.DeviceAlert build() {
                    Sitewhere.Model.DeviceAlert result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Model.DeviceAlert buildPartial() {
                    Sitewhere.Model.DeviceAlert result = new Sitewhere.Model.DeviceAlert(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.hardwareId_ = hardwareId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.alertType_ = alertType_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.alertMessage_ = alertMessage_;
                    if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                        to_bitField0_ |= 0x00000008;
                    }
                    result.eventDate_ = eventDate_;
                    if (metadataBuilder_ == null) {
                        if (((bitField0_ & 0x00000010) == 0x00000010)) {
                            metadata_ = java.util.Collections.unmodifiableList(metadata_);
                            bitField0_ = (bitField0_ & ~0x00000010);
                        }
                        result.metadata_ = metadata_;
                    } else {
                        result.metadata_ = metadataBuilder_.build();
                    }
                    if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                        to_bitField0_ |= 0x00000010;
                    }
                    result.updateState_ = updateState_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Model.DeviceAlert) {
                        return mergeFrom((Sitewhere.Model.DeviceAlert)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Model.DeviceAlert other) {
                    if (other == Sitewhere.Model.DeviceAlert.getDefaultInstance()) return this;
                    if (other.hasHardwareId()) {
                        bitField0_ |= 0x00000001;
                        hardwareId_ = other.hardwareId_;
                        onChanged();
                    }
                    if (other.hasAlertType()) {
                        bitField0_ |= 0x00000002;
                        alertType_ = other.alertType_;
                        onChanged();
                    }
                    if (other.hasAlertMessage()) {
                        bitField0_ |= 0x00000004;
                        alertMessage_ = other.alertMessage_;
                        onChanged();
                    }
                    if (other.hasEventDate()) {
                        setEventDate(other.getEventDate());
                    }
                    if (metadataBuilder_ == null) {
                        if (!other.metadata_.isEmpty()) {
                            if (metadata_.isEmpty()) {
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000010);
                            } else {
                                ensureMetadataIsMutable();
                                metadata_.addAll(other.metadata_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.metadata_.isEmpty()) {
                            if (metadataBuilder_.isEmpty()) {
                                metadataBuilder_.dispose();
                                metadataBuilder_ = null;
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000010);
                                metadataBuilder_ =
                                        com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                                getMetadataFieldBuilder() : null;
                            } else {
                                metadataBuilder_.addAllMessages(other.metadata_);
                            }
                        }
                    }
                    if (other.hasUpdateState()) {
                        setUpdateState(other.getUpdateState());
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasHardwareId()) {

                        return false;
                    }
                    if (!hasAlertType()) {

                        return false;
                    }
                    if (!hasAlertMessage()) {

                        return false;
                    }
                    for (int i = 0; i < getMetadataCount(); i++) {
                        if (!getMetadata(i).isInitialized()) {

                            return false;
                        }
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Model.DeviceAlert parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Model.DeviceAlert) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string hardwareId = 1;
                private java.lang.Object hardwareId_ = "";
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public boolean hasHardwareId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public java.lang.String getHardwareId() {
                    java.lang.Object ref = hardwareId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        hardwareId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getHardwareIdBytes() {
                    java.lang.Object ref = hardwareId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        hardwareId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder clearHardwareId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    hardwareId_ = getDefaultInstance().getHardwareId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }

                // required string alertType = 2;
                private java.lang.Object alertType_ = "";
                /**
                 * <code>required string alertType = 2;</code>
                 */
                public boolean hasAlertType() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required string alertType = 2;</code>
                 */
                public java.lang.String getAlertType() {
                    java.lang.Object ref = alertType_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        alertType_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string alertType = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getAlertTypeBytes() {
                    java.lang.Object ref = alertType_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        alertType_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string alertType = 2;</code>
                 */
                public Builder setAlertType(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    alertType_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string alertType = 2;</code>
                 */
                public Builder clearAlertType() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    alertType_ = getDefaultInstance().getAlertType();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string alertType = 2;</code>
                 */
                public Builder setAlertTypeBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    alertType_ = value;
                    onChanged();
                    return this;
                }

                // required string alertMessage = 3;
                private java.lang.Object alertMessage_ = "";
                /**
                 * <code>required string alertMessage = 3;</code>
                 */
                public boolean hasAlertMessage() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>required string alertMessage = 3;</code>
                 */
                public java.lang.String getAlertMessage() {
                    java.lang.Object ref = alertMessage_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        alertMessage_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string alertMessage = 3;</code>
                 */
                public com.google.protobuf.ByteString
                getAlertMessageBytes() {
                    java.lang.Object ref = alertMessage_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        alertMessage_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string alertMessage = 3;</code>
                 */
                public Builder setAlertMessage(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000004;
                    alertMessage_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string alertMessage = 3;</code>
                 */
                public Builder clearAlertMessage() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    alertMessage_ = getDefaultInstance().getAlertMessage();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string alertMessage = 3;</code>
                 */
                public Builder setAlertMessageBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000004;
                    alertMessage_ = value;
                    onChanged();
                    return this;
                }

                // optional fixed64 eventDate = 4;
                private long eventDate_ ;
                /**
                 * <code>optional fixed64 eventDate = 4;</code>
                 */
                public boolean hasEventDate() {
                    return ((bitField0_ & 0x00000008) == 0x00000008);
                }
                /**
                 * <code>optional fixed64 eventDate = 4;</code>
                 */
                public long getEventDate() {
                    return eventDate_;
                }
                /**
                 * <code>optional fixed64 eventDate = 4;</code>
                 */
                public Builder setEventDate(long value) {
                    bitField0_ |= 0x00000008;
                    eventDate_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional fixed64 eventDate = 4;</code>
                 */
                public Builder clearEventDate() {
                    bitField0_ = (bitField0_ & ~0x00000008);
                    eventDate_ = 0L;
                    onChanged();
                    return this;
                }

                // repeated .Model.Metadata metadata = 5;
                private java.util.List<Sitewhere.Model.Metadata> metadata_ =
                        java.util.Collections.emptyList();
                private void ensureMetadataIsMutable() {
                    if (!((bitField0_ & 0x00000010) == 0x00000010)) {
                        metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>(metadata_);
                        bitField0_ |= 0x00000010;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder> metadataBuilder_;

                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                    if (metadataBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(metadata_);
                    } else {
                        return metadataBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public int getMetadataCount() {
                    if (metadataBuilder_ == null) {
                        return metadata_.size();
                    } else {
                        return metadataBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Sitewhere.Model.Metadata getMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);
                    } else {
                        return metadataBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.set(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder addMetadata(Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder addMetadata(
                        Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder addAllMetadata(
                        java.lang.Iterable<? extends Sitewhere.Model.Metadata> values) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        super.addAll(values, metadata_);
                        onChanged();
                    } else {
                        metadataBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder clearMetadata() {
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000010);
                        onChanged();
                    } else {
                        metadataBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Builder removeMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.remove(index);
                        onChanged();
                    } else {
                        metadataBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Sitewhere.Model.Metadata.Builder getMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                        int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);  } else {
                        return metadataBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
                getMetadataOrBuilderList() {
                    if (metadataBuilder_ != null) {
                        return metadataBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(metadata_);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder() {
                    return getMetadataFieldBuilder().addBuilder(
                            Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().addBuilder(
                            index, Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 5;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata.Builder>
                getMetadataBuilderList() {
                    return getMetadataFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>
                getMetadataFieldBuilder() {
                    if (metadataBuilder_ == null) {
                        metadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                                Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>(
                                metadata_,
                                ((bitField0_ & 0x00000010) == 0x00000010),
                                getParentForChildren(),
                                isClean());
                        metadata_ = null;
                    }
                    return metadataBuilder_;
                }

                // optional bool updateState = 6;
                private boolean updateState_ ;
                /**
                 * <code>optional bool updateState = 6;</code>
                 */
                public boolean hasUpdateState() {
                    return ((bitField0_ & 0x00000020) == 0x00000020);
                }
                /**
                 * <code>optional bool updateState = 6;</code>
                 */
                public boolean getUpdateState() {
                    return updateState_;
                }
                /**
                 * <code>optional bool updateState = 6;</code>
                 */
                public Builder setUpdateState(boolean value) {
                    bitField0_ |= 0x00000020;
                    updateState_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional bool updateState = 6;</code>
                 */
                public Builder clearUpdateState() {
                    bitField0_ = (bitField0_ & ~0x00000020);
                    updateState_ = false;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:Model.DeviceAlert)
            }

            static {
                defaultInstance = new DeviceAlert(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Model.DeviceAlert)
        }

        public interface MeasurementOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string measurementId = 1;
            /**
             * <code>required string measurementId = 1;</code>
             */
            boolean hasMeasurementId();
            /**
             * <code>required string measurementId = 1;</code>
             */
            java.lang.String getMeasurementId();
            /**
             * <code>required string measurementId = 1;</code>
             */
            com.google.protobuf.ByteString
            getMeasurementIdBytes();

            // required double measurementValue = 2;
            /**
             * <code>required double measurementValue = 2;</code>
             */
            boolean hasMeasurementValue();
            /**
             * <code>required double measurementValue = 2;</code>
             */
            double getMeasurementValue();
        }
        /**
         * Protobuf type {@code Model.Measurement}
         *
         * <pre>
         * A single measurement.
         * </pre>
         */
        public static final class Measurement extends
                com.google.protobuf.GeneratedMessage
                implements MeasurementOrBuilder {
            // Use Measurement.newBuilder() to construct.
            private Measurement(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private Measurement(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final Measurement defaultInstance;
            public static Measurement getDefaultInstance() {
                return defaultInstance;
            }

            public Measurement getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private Measurement(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                measurementId_ = input.readBytes();
                                break;
                            }
                            case 17: {
                                bitField0_ |= 0x00000002;
                                measurementValue_ = input.readDouble();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Model_Measurement_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Model_Measurement_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Model.Measurement.class, Sitewhere.Model.Measurement.Builder.class);
            }

            public static com.google.protobuf.Parser<Measurement> PARSER =
                    new com.google.protobuf.AbstractParser<Measurement>() {
                        public Measurement parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new Measurement(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<Measurement> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string measurementId = 1;
            public static final int MEASUREMENTID_FIELD_NUMBER = 1;
            private java.lang.Object measurementId_;
            /**
             * <code>required string measurementId = 1;</code>
             */
            public boolean hasMeasurementId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string measurementId = 1;</code>
             */
            public java.lang.String getMeasurementId() {
                java.lang.Object ref = measurementId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        measurementId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string measurementId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getMeasurementIdBytes() {
                java.lang.Object ref = measurementId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    measurementId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required double measurementValue = 2;
            public static final int MEASUREMENTVALUE_FIELD_NUMBER = 2;
            private double measurementValue_;
            /**
             * <code>required double measurementValue = 2;</code>
             */
            public boolean hasMeasurementValue() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required double measurementValue = 2;</code>
             */
            public double getMeasurementValue() {
                return measurementValue_;
            }

            private void initFields() {
                measurementId_ = "";
                measurementValue_ = 0D;
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasMeasurementId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasMeasurementValue()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getMeasurementIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeDouble(2, measurementValue_);
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getMeasurementIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(2, measurementValue_);
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Model.Measurement parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.Measurement parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.Measurement parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.Measurement parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.Measurement parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.Measurement parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.Measurement parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Model.Measurement parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.Measurement parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.Measurement parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Model.Measurement prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Model.Measurement}
             *
             * <pre>
             * A single measurement.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Model.MeasurementOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Model_Measurement_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Model_Measurement_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Model.Measurement.class, Sitewhere.Model.Measurement.Builder.class);
                }

                // Construct using Sitewhere.Model.Measurement.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    measurementId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    measurementValue_ = 0D;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Model_Measurement_descriptor;
                }

                public Sitewhere.Model.Measurement getDefaultInstanceForType() {
                    return Sitewhere.Model.Measurement.getDefaultInstance();
                }

                public Sitewhere.Model.Measurement build() {
                    Sitewhere.Model.Measurement result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Model.Measurement buildPartial() {
                    Sitewhere.Model.Measurement result = new Sitewhere.Model.Measurement(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.measurementId_ = measurementId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.measurementValue_ = measurementValue_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Model.Measurement) {
                        return mergeFrom((Sitewhere.Model.Measurement)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Model.Measurement other) {
                    if (other == Sitewhere.Model.Measurement.getDefaultInstance()) return this;
                    if (other.hasMeasurementId()) {
                        bitField0_ |= 0x00000001;
                        measurementId_ = other.measurementId_;
                        onChanged();
                    }
                    if (other.hasMeasurementValue()) {
                        setMeasurementValue(other.getMeasurementValue());
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasMeasurementId()) {

                        return false;
                    }
                    if (!hasMeasurementValue()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Model.Measurement parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Model.Measurement) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string measurementId = 1;
                private java.lang.Object measurementId_ = "";
                /**
                 * <code>required string measurementId = 1;</code>
                 */
                public boolean hasMeasurementId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string measurementId = 1;</code>
                 */
                public java.lang.String getMeasurementId() {
                    java.lang.Object ref = measurementId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        measurementId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string measurementId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getMeasurementIdBytes() {
                    java.lang.Object ref = measurementId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        measurementId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string measurementId = 1;</code>
                 */
                public Builder setMeasurementId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    measurementId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string measurementId = 1;</code>
                 */
                public Builder clearMeasurementId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    measurementId_ = getDefaultInstance().getMeasurementId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string measurementId = 1;</code>
                 */
                public Builder setMeasurementIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    measurementId_ = value;
                    onChanged();
                    return this;
                }

                // required double measurementValue = 2;
                private double measurementValue_ ;
                /**
                 * <code>required double measurementValue = 2;</code>
                 */
                public boolean hasMeasurementValue() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required double measurementValue = 2;</code>
                 */
                public double getMeasurementValue() {
                    return measurementValue_;
                }
                /**
                 * <code>required double measurementValue = 2;</code>
                 */
                public Builder setMeasurementValue(double value) {
                    bitField0_ |= 0x00000002;
                    measurementValue_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required double measurementValue = 2;</code>
                 */
                public Builder clearMeasurementValue() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    measurementValue_ = 0D;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:Model.Measurement)
            }

            static {
                defaultInstance = new Measurement(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Model.Measurement)
        }

        public interface DeviceMeasurementsOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string hardwareId = 1;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            boolean hasHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            java.lang.String getHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            com.google.protobuf.ByteString
            getHardwareIdBytes();

            // repeated .Model.Measurement measurement = 2;
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            java.util.List<Sitewhere.Model.Measurement>
            getMeasurementList();
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            Sitewhere.Model.Measurement getMeasurement(int index);
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            int getMeasurementCount();
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            java.util.List<? extends Sitewhere.Model.MeasurementOrBuilder>
            getMeasurementOrBuilderList();
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            Sitewhere.Model.MeasurementOrBuilder getMeasurementOrBuilder(
                    int index);

            // optional fixed64 eventDate = 3;
            /**
             * <code>optional fixed64 eventDate = 3;</code>
             */
            boolean hasEventDate();
            /**
             * <code>optional fixed64 eventDate = 3;</code>
             */
            long getEventDate();

            // repeated .Model.Metadata metadata = 4;
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            java.util.List<Sitewhere.Model.Metadata>
            getMetadataList();
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            Sitewhere.Model.Metadata getMetadata(int index);
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            int getMetadataCount();
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList();
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index);

            // optional bool updateState = 5;
            /**
             * <code>optional bool updateState = 5;</code>
             */
            boolean hasUpdateState();
            /**
             * <code>optional bool updateState = 5;</code>
             */
            boolean getUpdateState();
        }
        /**
         * Protobuf type {@code Model.DeviceMeasurements}
         *
         * <pre>
         * Event message for device measurements.
         * </pre>
         */
        public static final class DeviceMeasurements extends
                com.google.protobuf.GeneratedMessage
                implements DeviceMeasurementsOrBuilder {
            // Use DeviceMeasurements.newBuilder() to construct.
            private DeviceMeasurements(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private DeviceMeasurements(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final DeviceMeasurements defaultInstance;
            public static DeviceMeasurements getDefaultInstance() {
                return defaultInstance;
            }

            public DeviceMeasurements getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private DeviceMeasurements(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                hardwareId_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                    measurement_ = new java.util.ArrayList<Sitewhere.Model.Measurement>();
                                    mutable_bitField0_ |= 0x00000002;
                                }
                                measurement_.add(input.readMessage(Sitewhere.Model.Measurement.PARSER, extensionRegistry));
                                break;
                            }
                            case 25: {
                                bitField0_ |= 0x00000002;
                                eventDate_ = input.readFixed64();
                                break;
                            }
                            case 34: {
                                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                                    metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>();
                                    mutable_bitField0_ |= 0x00000008;
                                }
                                metadata_.add(input.readMessage(Sitewhere.Model.Metadata.PARSER, extensionRegistry));
                                break;
                            }
                            case 40: {
                                bitField0_ |= 0x00000004;
                                updateState_ = input.readBool();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                        measurement_ = java.util.Collections.unmodifiableList(measurement_);
                    }
                    if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                        metadata_ = java.util.Collections.unmodifiableList(metadata_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Model_DeviceMeasurements_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Model_DeviceMeasurements_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Model.DeviceMeasurements.class, Sitewhere.Model.DeviceMeasurements.Builder.class);
            }

            public static com.google.protobuf.Parser<DeviceMeasurements> PARSER =
                    new com.google.protobuf.AbstractParser<DeviceMeasurements>() {
                        public DeviceMeasurements parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new DeviceMeasurements(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<DeviceMeasurements> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string hardwareId = 1;
            public static final int HARDWAREID_FIELD_NUMBER = 1;
            private java.lang.Object hardwareId_;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public boolean hasHardwareId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public java.lang.String getHardwareId() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        hardwareId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getHardwareIdBytes() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hardwareId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // repeated .Model.Measurement measurement = 2;
            public static final int MEASUREMENT_FIELD_NUMBER = 2;
            private java.util.List<Sitewhere.Model.Measurement> measurement_;
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            public java.util.List<Sitewhere.Model.Measurement> getMeasurementList() {
                return measurement_;
            }
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            public java.util.List<? extends Sitewhere.Model.MeasurementOrBuilder>
            getMeasurementOrBuilderList() {
                return measurement_;
            }
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            public int getMeasurementCount() {
                return measurement_.size();
            }
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            public Sitewhere.Model.Measurement getMeasurement(int index) {
                return measurement_.get(index);
            }
            /**
             * <code>repeated .Model.Measurement measurement = 2;</code>
             */
            public Sitewhere.Model.MeasurementOrBuilder getMeasurementOrBuilder(
                    int index) {
                return measurement_.get(index);
            }

            // optional fixed64 eventDate = 3;
            public static final int EVENTDATE_FIELD_NUMBER = 3;
            private long eventDate_;
            /**
             * <code>optional fixed64 eventDate = 3;</code>
             */
            public boolean hasEventDate() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional fixed64 eventDate = 3;</code>
             */
            public long getEventDate() {
                return eventDate_;
            }

            // repeated .Model.Metadata metadata = 4;
            public static final int METADATA_FIELD_NUMBER = 4;
            private java.util.List<Sitewhere.Model.Metadata> metadata_;
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public int getMetadataCount() {
                return metadata_.size();
            }
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public Sitewhere.Model.Metadata getMetadata(int index) {
                return metadata_.get(index);
            }
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index) {
                return metadata_.get(index);
            }

            // optional bool updateState = 5;
            public static final int UPDATESTATE_FIELD_NUMBER = 5;
            private boolean updateState_;
            /**
             * <code>optional bool updateState = 5;</code>
             */
            public boolean hasUpdateState() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional bool updateState = 5;</code>
             */
            public boolean getUpdateState() {
                return updateState_;
            }

            private void initFields() {
                hardwareId_ = "";
                measurement_ = java.util.Collections.emptyList();
                eventDate_ = 0L;
                metadata_ = java.util.Collections.emptyList();
                updateState_ = false;
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasHardwareId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                for (int i = 0; i < getMeasurementCount(); i++) {
                    if (!getMeasurement(i).isInitialized()) {
                        memoizedIsInitialized = 0;
                        return false;
                    }
                }
                for (int i = 0; i < getMetadataCount(); i++) {
                    if (!getMetadata(i).isInitialized()) {
                        memoizedIsInitialized = 0;
                        return false;
                    }
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getHardwareIdBytes());
                }
                for (int i = 0; i < measurement_.size(); i++) {
                    output.writeMessage(2, measurement_.get(i));
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeFixed64(3, eventDate_);
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    output.writeMessage(4, metadata_.get(i));
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeBool(5, updateState_);
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getHardwareIdBytes());
                }
                for (int i = 0; i < measurement_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(2, measurement_.get(i));
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeFixed64Size(3, eventDate_);
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(4, metadata_.get(i));
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBoolSize(5, updateState_);
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Model.DeviceMeasurements parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceMeasurements parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceMeasurements parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceMeasurements parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceMeasurements parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceMeasurements parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceMeasurements parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Model.DeviceMeasurements parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceMeasurements parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceMeasurements parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Model.DeviceMeasurements prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Model.DeviceMeasurements}
             *
             * <pre>
             * Event message for device measurements.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Model.DeviceMeasurementsOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Model_DeviceMeasurements_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Model_DeviceMeasurements_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Model.DeviceMeasurements.class, Sitewhere.Model.DeviceMeasurements.Builder.class);
                }

                // Construct using Sitewhere.Model.DeviceMeasurements.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                        getMeasurementFieldBuilder();
                        getMetadataFieldBuilder();
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    hardwareId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    if (measurementBuilder_ == null) {
                        measurement_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        measurementBuilder_.clear();
                    }
                    eventDate_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000004);
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000008);
                    } else {
                        metadataBuilder_.clear();
                    }
                    updateState_ = false;
                    bitField0_ = (bitField0_ & ~0x00000010);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Model_DeviceMeasurements_descriptor;
                }

                public Sitewhere.Model.DeviceMeasurements getDefaultInstanceForType() {
                    return Sitewhere.Model.DeviceMeasurements.getDefaultInstance();
                }

                public Sitewhere.Model.DeviceMeasurements build() {
                    Sitewhere.Model.DeviceMeasurements result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Model.DeviceMeasurements buildPartial() {
                    Sitewhere.Model.DeviceMeasurements result = new Sitewhere.Model.DeviceMeasurements(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.hardwareId_ = hardwareId_;
                    if (measurementBuilder_ == null) {
                        if (((bitField0_ & 0x00000002) == 0x00000002)) {
                            measurement_ = java.util.Collections.unmodifiableList(measurement_);
                            bitField0_ = (bitField0_ & ~0x00000002);
                        }
                        result.measurement_ = measurement_;
                    } else {
                        result.measurement_ = measurementBuilder_.build();
                    }
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.eventDate_ = eventDate_;
                    if (metadataBuilder_ == null) {
                        if (((bitField0_ & 0x00000008) == 0x00000008)) {
                            metadata_ = java.util.Collections.unmodifiableList(metadata_);
                            bitField0_ = (bitField0_ & ~0x00000008);
                        }
                        result.metadata_ = metadata_;
                    } else {
                        result.metadata_ = metadataBuilder_.build();
                    }
                    if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.updateState_ = updateState_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Model.DeviceMeasurements) {
                        return mergeFrom((Sitewhere.Model.DeviceMeasurements)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Model.DeviceMeasurements other) {
                    if (other == Sitewhere.Model.DeviceMeasurements.getDefaultInstance()) return this;
                    if (other.hasHardwareId()) {
                        bitField0_ |= 0x00000001;
                        hardwareId_ = other.hardwareId_;
                        onChanged();
                    }
                    if (measurementBuilder_ == null) {
                        if (!other.measurement_.isEmpty()) {
                            if (measurement_.isEmpty()) {
                                measurement_ = other.measurement_;
                                bitField0_ = (bitField0_ & ~0x00000002);
                            } else {
                                ensureMeasurementIsMutable();
                                measurement_.addAll(other.measurement_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.measurement_.isEmpty()) {
                            if (measurementBuilder_.isEmpty()) {
                                measurementBuilder_.dispose();
                                measurementBuilder_ = null;
                                measurement_ = other.measurement_;
                                bitField0_ = (bitField0_ & ~0x00000002);
                                measurementBuilder_ =
                                        com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                                getMeasurementFieldBuilder() : null;
                            } else {
                                measurementBuilder_.addAllMessages(other.measurement_);
                            }
                        }
                    }
                    if (other.hasEventDate()) {
                        setEventDate(other.getEventDate());
                    }
                    if (metadataBuilder_ == null) {
                        if (!other.metadata_.isEmpty()) {
                            if (metadata_.isEmpty()) {
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000008);
                            } else {
                                ensureMetadataIsMutable();
                                metadata_.addAll(other.metadata_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.metadata_.isEmpty()) {
                            if (metadataBuilder_.isEmpty()) {
                                metadataBuilder_.dispose();
                                metadataBuilder_ = null;
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000008);
                                metadataBuilder_ =
                                        com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                                getMetadataFieldBuilder() : null;
                            } else {
                                metadataBuilder_.addAllMessages(other.metadata_);
                            }
                        }
                    }
                    if (other.hasUpdateState()) {
                        setUpdateState(other.getUpdateState());
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasHardwareId()) {

                        return false;
                    }
                    for (int i = 0; i < getMeasurementCount(); i++) {
                        if (!getMeasurement(i).isInitialized()) {

                            return false;
                        }
                    }
                    for (int i = 0; i < getMetadataCount(); i++) {
                        if (!getMetadata(i).isInitialized()) {

                            return false;
                        }
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Model.DeviceMeasurements parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Model.DeviceMeasurements) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string hardwareId = 1;
                private java.lang.Object hardwareId_ = "";
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public boolean hasHardwareId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public java.lang.String getHardwareId() {
                    java.lang.Object ref = hardwareId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        hardwareId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getHardwareIdBytes() {
                    java.lang.Object ref = hardwareId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        hardwareId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder clearHardwareId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    hardwareId_ = getDefaultInstance().getHardwareId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }

                // repeated .Model.Measurement measurement = 2;
                private java.util.List<Sitewhere.Model.Measurement> measurement_ =
                        java.util.Collections.emptyList();
                private void ensureMeasurementIsMutable() {
                    if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                        measurement_ = new java.util.ArrayList<Sitewhere.Model.Measurement>(measurement_);
                        bitField0_ |= 0x00000002;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Measurement, Sitewhere.Model.Measurement.Builder, Sitewhere.Model.MeasurementOrBuilder> measurementBuilder_;

                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public java.util.List<Sitewhere.Model.Measurement> getMeasurementList() {
                    if (measurementBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(measurement_);
                    } else {
                        return measurementBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public int getMeasurementCount() {
                    if (measurementBuilder_ == null) {
                        return measurement_.size();
                    } else {
                        return measurementBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Sitewhere.Model.Measurement getMeasurement(int index) {
                    if (measurementBuilder_ == null) {
                        return measurement_.get(index);
                    } else {
                        return measurementBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder setMeasurement(
                        int index, Sitewhere.Model.Measurement value) {
                    if (measurementBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMeasurementIsMutable();
                        measurement_.set(index, value);
                        onChanged();
                    } else {
                        measurementBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder setMeasurement(
                        int index, Sitewhere.Model.Measurement.Builder builderForValue) {
                    if (measurementBuilder_ == null) {
                        ensureMeasurementIsMutable();
                        measurement_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        measurementBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder addMeasurement(Sitewhere.Model.Measurement value) {
                    if (measurementBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMeasurementIsMutable();
                        measurement_.add(value);
                        onChanged();
                    } else {
                        measurementBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder addMeasurement(
                        int index, Sitewhere.Model.Measurement value) {
                    if (measurementBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMeasurementIsMutable();
                        measurement_.add(index, value);
                        onChanged();
                    } else {
                        measurementBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder addMeasurement(
                        Sitewhere.Model.Measurement.Builder builderForValue) {
                    if (measurementBuilder_ == null) {
                        ensureMeasurementIsMutable();
                        measurement_.add(builderForValue.build());
                        onChanged();
                    } else {
                        measurementBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder addMeasurement(
                        int index, Sitewhere.Model.Measurement.Builder builderForValue) {
                    if (measurementBuilder_ == null) {
                        ensureMeasurementIsMutable();
                        measurement_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        measurementBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder addAllMeasurement(
                        java.lang.Iterable<? extends Sitewhere.Model.Measurement> values) {
                    if (measurementBuilder_ == null) {
                        ensureMeasurementIsMutable();
                        super.addAll(values, measurement_);
                        onChanged();
                    } else {
                        measurementBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder clearMeasurement() {
                    if (measurementBuilder_ == null) {
                        measurement_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000002);
                        onChanged();
                    } else {
                        measurementBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Builder removeMeasurement(int index) {
                    if (measurementBuilder_ == null) {
                        ensureMeasurementIsMutable();
                        measurement_.remove(index);
                        onChanged();
                    } else {
                        measurementBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Sitewhere.Model.Measurement.Builder getMeasurementBuilder(
                        int index) {
                    return getMeasurementFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Sitewhere.Model.MeasurementOrBuilder getMeasurementOrBuilder(
                        int index) {
                    if (measurementBuilder_ == null) {
                        return measurement_.get(index);  } else {
                        return measurementBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public java.util.List<? extends Sitewhere.Model.MeasurementOrBuilder>
                getMeasurementOrBuilderList() {
                    if (measurementBuilder_ != null) {
                        return measurementBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(measurement_);
                    }
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Sitewhere.Model.Measurement.Builder addMeasurementBuilder() {
                    return getMeasurementFieldBuilder().addBuilder(
                            Sitewhere.Model.Measurement.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public Sitewhere.Model.Measurement.Builder addMeasurementBuilder(
                        int index) {
                    return getMeasurementFieldBuilder().addBuilder(
                            index, Sitewhere.Model.Measurement.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Measurement measurement = 2;</code>
                 */
                public java.util.List<Sitewhere.Model.Measurement.Builder>
                getMeasurementBuilderList() {
                    return getMeasurementFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Measurement, Sitewhere.Model.Measurement.Builder, Sitewhere.Model.MeasurementOrBuilder>
                getMeasurementFieldBuilder() {
                    if (measurementBuilder_ == null) {
                        measurementBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                                Sitewhere.Model.Measurement, Sitewhere.Model.Measurement.Builder, Sitewhere.Model.MeasurementOrBuilder>(
                                measurement_,
                                ((bitField0_ & 0x00000002) == 0x00000002),
                                getParentForChildren(),
                                isClean());
                        measurement_ = null;
                    }
                    return measurementBuilder_;
                }

                // optional fixed64 eventDate = 3;
                private long eventDate_ ;
                /**
                 * <code>optional fixed64 eventDate = 3;</code>
                 */
                public boolean hasEventDate() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>optional fixed64 eventDate = 3;</code>
                 */
                public long getEventDate() {
                    return eventDate_;
                }
                /**
                 * <code>optional fixed64 eventDate = 3;</code>
                 */
                public Builder setEventDate(long value) {
                    bitField0_ |= 0x00000004;
                    eventDate_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional fixed64 eventDate = 3;</code>
                 */
                public Builder clearEventDate() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    eventDate_ = 0L;
                    onChanged();
                    return this;
                }

                // repeated .Model.Metadata metadata = 4;
                private java.util.List<Sitewhere.Model.Metadata> metadata_ =
                        java.util.Collections.emptyList();
                private void ensureMetadataIsMutable() {
                    if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                        metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>(metadata_);
                        bitField0_ |= 0x00000008;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder> metadataBuilder_;

                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                    if (metadataBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(metadata_);
                    } else {
                        return metadataBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public int getMetadataCount() {
                    if (metadataBuilder_ == null) {
                        return metadata_.size();
                    } else {
                        return metadataBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.Metadata getMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);
                    } else {
                        return metadataBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.set(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addMetadata(Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addMetadata(
                        Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addAllMetadata(
                        java.lang.Iterable<? extends Sitewhere.Model.Metadata> values) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        super.addAll(values, metadata_);
                        onChanged();
                    } else {
                        metadataBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder clearMetadata() {
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000008);
                        onChanged();
                    } else {
                        metadataBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder removeMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.remove(index);
                        onChanged();
                    } else {
                        metadataBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.Metadata.Builder getMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                        int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);  } else {
                        return metadataBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
                getMetadataOrBuilderList() {
                    if (metadataBuilder_ != null) {
                        return metadataBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(metadata_);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder() {
                    return getMetadataFieldBuilder().addBuilder(
                            Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().addBuilder(
                            index, Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata.Builder>
                getMetadataBuilderList() {
                    return getMetadataFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>
                getMetadataFieldBuilder() {
                    if (metadataBuilder_ == null) {
                        metadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                                Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>(
                                metadata_,
                                ((bitField0_ & 0x00000008) == 0x00000008),
                                getParentForChildren(),
                                isClean());
                        metadata_ = null;
                    }
                    return metadataBuilder_;
                }

                // optional bool updateState = 5;
                private boolean updateState_ ;
                /**
                 * <code>optional bool updateState = 5;</code>
                 */
                public boolean hasUpdateState() {
                    return ((bitField0_ & 0x00000010) == 0x00000010);
                }
                /**
                 * <code>optional bool updateState = 5;</code>
                 */
                public boolean getUpdateState() {
                    return updateState_;
                }
                /**
                 * <code>optional bool updateState = 5;</code>
                 */
                public Builder setUpdateState(boolean value) {
                    bitField0_ |= 0x00000010;
                    updateState_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional bool updateState = 5;</code>
                 */
                public Builder clearUpdateState() {
                    bitField0_ = (bitField0_ & ~0x00000010);
                    updateState_ = false;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:Model.DeviceMeasurements)
            }

            static {
                defaultInstance = new DeviceMeasurements(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Model.DeviceMeasurements)
        }

        public interface DeviceStreamOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string hardwareId = 1;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            boolean hasHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            java.lang.String getHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            com.google.protobuf.ByteString
            getHardwareIdBytes();

            // required string streamId = 2;
            /**
             * <code>required string streamId = 2;</code>
             */
            boolean hasStreamId();
            /**
             * <code>required string streamId = 2;</code>
             */
            java.lang.String getStreamId();
            /**
             * <code>required string streamId = 2;</code>
             */
            com.google.protobuf.ByteString
            getStreamIdBytes();

            // required string contentType = 3;
            /**
             * <code>required string contentType = 3;</code>
             */
            boolean hasContentType();
            /**
             * <code>required string contentType = 3;</code>
             */
            java.lang.String getContentType();
            /**
             * <code>required string contentType = 3;</code>
             */
            com.google.protobuf.ByteString
            getContentTypeBytes();

            // repeated .Model.Metadata metadata = 4;
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            java.util.List<Sitewhere.Model.Metadata>
            getMetadataList();
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            Sitewhere.Model.Metadata getMetadata(int index);
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            int getMetadataCount();
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList();
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index);
        }
        /**
         * Protobuf type {@code Model.DeviceStream}
         *
         * <pre>
         * Create a device stream.
         * </pre>
         */
        public static final class DeviceStream extends
                com.google.protobuf.GeneratedMessage
                implements DeviceStreamOrBuilder {
            // Use DeviceStream.newBuilder() to construct.
            private DeviceStream(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private DeviceStream(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final DeviceStream defaultInstance;
            public static DeviceStream getDefaultInstance() {
                return defaultInstance;
            }

            public DeviceStream getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private DeviceStream(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                hardwareId_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                streamId_ = input.readBytes();
                                break;
                            }
                            case 26: {
                                bitField0_ |= 0x00000004;
                                contentType_ = input.readBytes();
                                break;
                            }
                            case 34: {
                                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                                    metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>();
                                    mutable_bitField0_ |= 0x00000008;
                                }
                                metadata_.add(input.readMessage(Sitewhere.Model.Metadata.PARSER, extensionRegistry));
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                        metadata_ = java.util.Collections.unmodifiableList(metadata_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Model_DeviceStream_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Model_DeviceStream_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Model.DeviceStream.class, Sitewhere.Model.DeviceStream.Builder.class);
            }

            public static com.google.protobuf.Parser<DeviceStream> PARSER =
                    new com.google.protobuf.AbstractParser<DeviceStream>() {
                        public DeviceStream parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new DeviceStream(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<DeviceStream> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string hardwareId = 1;
            public static final int HARDWAREID_FIELD_NUMBER = 1;
            private java.lang.Object hardwareId_;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public boolean hasHardwareId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public java.lang.String getHardwareId() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        hardwareId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getHardwareIdBytes() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hardwareId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required string streamId = 2;
            public static final int STREAMID_FIELD_NUMBER = 2;
            private java.lang.Object streamId_;
            /**
             * <code>required string streamId = 2;</code>
             */
            public boolean hasStreamId() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string streamId = 2;</code>
             */
            public java.lang.String getStreamId() {
                java.lang.Object ref = streamId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        streamId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string streamId = 2;</code>
             */
            public com.google.protobuf.ByteString
            getStreamIdBytes() {
                java.lang.Object ref = streamId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    streamId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required string contentType = 3;
            public static final int CONTENTTYPE_FIELD_NUMBER = 3;
            private java.lang.Object contentType_;
            /**
             * <code>required string contentType = 3;</code>
             */
            public boolean hasContentType() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required string contentType = 3;</code>
             */
            public java.lang.String getContentType() {
                java.lang.Object ref = contentType_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        contentType_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string contentType = 3;</code>
             */
            public com.google.protobuf.ByteString
            getContentTypeBytes() {
                java.lang.Object ref = contentType_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    contentType_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // repeated .Model.Metadata metadata = 4;
            public static final int METADATA_FIELD_NUMBER = 4;
            private java.util.List<Sitewhere.Model.Metadata> metadata_;
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public int getMetadataCount() {
                return metadata_.size();
            }
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public Sitewhere.Model.Metadata getMetadata(int index) {
                return metadata_.get(index);
            }
            /**
             * <code>repeated .Model.Metadata metadata = 4;</code>
             */
            public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index) {
                return metadata_.get(index);
            }

            private void initFields() {
                hardwareId_ = "";
                streamId_ = "";
                contentType_ = "";
                metadata_ = java.util.Collections.emptyList();
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasHardwareId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasStreamId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasContentType()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                for (int i = 0; i < getMetadataCount(); i++) {
                    if (!getMetadata(i).isInitialized()) {
                        memoizedIsInitialized = 0;
                        return false;
                    }
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getStreamIdBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeBytes(3, getContentTypeBytes());
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    output.writeMessage(4, metadata_.get(i));
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getStreamIdBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(3, getContentTypeBytes());
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(4, metadata_.get(i));
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Model.DeviceStream parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceStream parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceStream parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceStream parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceStream parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceStream parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceStream parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Model.DeviceStream parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceStream parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceStream parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Model.DeviceStream prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Model.DeviceStream}
             *
             * <pre>
             * Create a device stream.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Model.DeviceStreamOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Model_DeviceStream_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Model_DeviceStream_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Model.DeviceStream.class, Sitewhere.Model.DeviceStream.Builder.class);
                }

                // Construct using Sitewhere.Model.DeviceStream.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                        getMetadataFieldBuilder();
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    hardwareId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    streamId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    contentType_ = "";
                    bitField0_ = (bitField0_ & ~0x00000004);
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000008);
                    } else {
                        metadataBuilder_.clear();
                    }
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Model_DeviceStream_descriptor;
                }

                public Sitewhere.Model.DeviceStream getDefaultInstanceForType() {
                    return Sitewhere.Model.DeviceStream.getDefaultInstance();
                }

                public Sitewhere.Model.DeviceStream build() {
                    Sitewhere.Model.DeviceStream result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Model.DeviceStream buildPartial() {
                    Sitewhere.Model.DeviceStream result = new Sitewhere.Model.DeviceStream(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.hardwareId_ = hardwareId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.streamId_ = streamId_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.contentType_ = contentType_;
                    if (metadataBuilder_ == null) {
                        if (((bitField0_ & 0x00000008) == 0x00000008)) {
                            metadata_ = java.util.Collections.unmodifiableList(metadata_);
                            bitField0_ = (bitField0_ & ~0x00000008);
                        }
                        result.metadata_ = metadata_;
                    } else {
                        result.metadata_ = metadataBuilder_.build();
                    }
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Model.DeviceStream) {
                        return mergeFrom((Sitewhere.Model.DeviceStream)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Model.DeviceStream other) {
                    if (other == Sitewhere.Model.DeviceStream.getDefaultInstance()) return this;
                    if (other.hasHardwareId()) {
                        bitField0_ |= 0x00000001;
                        hardwareId_ = other.hardwareId_;
                        onChanged();
                    }
                    if (other.hasStreamId()) {
                        bitField0_ |= 0x00000002;
                        streamId_ = other.streamId_;
                        onChanged();
                    }
                    if (other.hasContentType()) {
                        bitField0_ |= 0x00000004;
                        contentType_ = other.contentType_;
                        onChanged();
                    }
                    if (metadataBuilder_ == null) {
                        if (!other.metadata_.isEmpty()) {
                            if (metadata_.isEmpty()) {
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000008);
                            } else {
                                ensureMetadataIsMutable();
                                metadata_.addAll(other.metadata_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.metadata_.isEmpty()) {
                            if (metadataBuilder_.isEmpty()) {
                                metadataBuilder_.dispose();
                                metadataBuilder_ = null;
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000008);
                                metadataBuilder_ =
                                        com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                                getMetadataFieldBuilder() : null;
                            } else {
                                metadataBuilder_.addAllMessages(other.metadata_);
                            }
                        }
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasHardwareId()) {

                        return false;
                    }
                    if (!hasStreamId()) {

                        return false;
                    }
                    if (!hasContentType()) {

                        return false;
                    }
                    for (int i = 0; i < getMetadataCount(); i++) {
                        if (!getMetadata(i).isInitialized()) {

                            return false;
                        }
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Model.DeviceStream parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Model.DeviceStream) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string hardwareId = 1;
                private java.lang.Object hardwareId_ = "";
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public boolean hasHardwareId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public java.lang.String getHardwareId() {
                    java.lang.Object ref = hardwareId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        hardwareId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getHardwareIdBytes() {
                    java.lang.Object ref = hardwareId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        hardwareId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder clearHardwareId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    hardwareId_ = getDefaultInstance().getHardwareId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }

                // required string streamId = 2;
                private java.lang.Object streamId_ = "";
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public boolean hasStreamId() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public java.lang.String getStreamId() {
                    java.lang.Object ref = streamId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        streamId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getStreamIdBytes() {
                    java.lang.Object ref = streamId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        streamId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder setStreamId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    streamId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder clearStreamId() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    streamId_ = getDefaultInstance().getStreamId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder setStreamIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    streamId_ = value;
                    onChanged();
                    return this;
                }

                // required string contentType = 3;
                private java.lang.Object contentType_ = "";
                /**
                 * <code>required string contentType = 3;</code>
                 */
                public boolean hasContentType() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>required string contentType = 3;</code>
                 */
                public java.lang.String getContentType() {
                    java.lang.Object ref = contentType_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        contentType_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string contentType = 3;</code>
                 */
                public com.google.protobuf.ByteString
                getContentTypeBytes() {
                    java.lang.Object ref = contentType_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        contentType_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string contentType = 3;</code>
                 */
                public Builder setContentType(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000004;
                    contentType_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string contentType = 3;</code>
                 */
                public Builder clearContentType() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    contentType_ = getDefaultInstance().getContentType();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string contentType = 3;</code>
                 */
                public Builder setContentTypeBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000004;
                    contentType_ = value;
                    onChanged();
                    return this;
                }

                // repeated .Model.Metadata metadata = 4;
                private java.util.List<Sitewhere.Model.Metadata> metadata_ =
                        java.util.Collections.emptyList();
                private void ensureMetadataIsMutable() {
                    if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                        metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>(metadata_);
                        bitField0_ |= 0x00000008;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder> metadataBuilder_;

                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                    if (metadataBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(metadata_);
                    } else {
                        return metadataBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public int getMetadataCount() {
                    if (metadataBuilder_ == null) {
                        return metadata_.size();
                    } else {
                        return metadataBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.Metadata getMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);
                    } else {
                        return metadataBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.set(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addMetadata(Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addMetadata(
                        Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder addAllMetadata(
                        java.lang.Iterable<? extends Sitewhere.Model.Metadata> values) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        super.addAll(values, metadata_);
                        onChanged();
                    } else {
                        metadataBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder clearMetadata() {
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000008);
                        onChanged();
                    } else {
                        metadataBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Builder removeMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.remove(index);
                        onChanged();
                    } else {
                        metadataBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.Metadata.Builder getMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                        int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);  } else {
                        return metadataBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
                getMetadataOrBuilderList() {
                    if (metadataBuilder_ != null) {
                        return metadataBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(metadata_);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder() {
                    return getMetadataFieldBuilder().addBuilder(
                            Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().addBuilder(
                            index, Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 4;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata.Builder>
                getMetadataBuilderList() {
                    return getMetadataFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>
                getMetadataFieldBuilder() {
                    if (metadataBuilder_ == null) {
                        metadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                                Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>(
                                metadata_,
                                ((bitField0_ & 0x00000008) == 0x00000008),
                                getParentForChildren(),
                                isClean());
                        metadata_ = null;
                    }
                    return metadataBuilder_;
                }

                // @@protoc_insertion_point(builder_scope:Model.DeviceStream)
            }

            static {
                defaultInstance = new DeviceStream(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Model.DeviceStream)
        }

        public interface DeviceStreamDataOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string hardwareId = 1;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            boolean hasHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            java.lang.String getHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            com.google.protobuf.ByteString
            getHardwareIdBytes();

            // required string streamId = 2;
            /**
             * <code>required string streamId = 2;</code>
             */
            boolean hasStreamId();
            /**
             * <code>required string streamId = 2;</code>
             */
            java.lang.String getStreamId();
            /**
             * <code>required string streamId = 2;</code>
             */
            com.google.protobuf.ByteString
            getStreamIdBytes();

            // required fixed64 sequenceNumber = 3;
            /**
             * <code>required fixed64 sequenceNumber = 3;</code>
             */
            boolean hasSequenceNumber();
            /**
             * <code>required fixed64 sequenceNumber = 3;</code>
             */
            long getSequenceNumber();

            // required bytes data = 4;
            /**
             * <code>required bytes data = 4;</code>
             */
            boolean hasData();
            /**
             * <code>required bytes data = 4;</code>
             */
            com.google.protobuf.ByteString getData();

            // optional fixed64 eventDate = 5;
            /**
             * <code>optional fixed64 eventDate = 5;</code>
             */
            boolean hasEventDate();
            /**
             * <code>optional fixed64 eventDate = 5;</code>
             */
            long getEventDate();

            // repeated .Model.Metadata metadata = 6;
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            java.util.List<Sitewhere.Model.Metadata>
            getMetadataList();
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            Sitewhere.Model.Metadata getMetadata(int index);
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            int getMetadataCount();
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList();
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index);
        }
        /**
         * Protobuf type {@code Model.DeviceStreamData}
         *
         * <pre>
         * A chunk of streaming data.
         * </pre>
         */
        public static final class DeviceStreamData extends
                com.google.protobuf.GeneratedMessage
                implements DeviceStreamDataOrBuilder {
            // Use DeviceStreamData.newBuilder() to construct.
            private DeviceStreamData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private DeviceStreamData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final DeviceStreamData defaultInstance;
            public static DeviceStreamData getDefaultInstance() {
                return defaultInstance;
            }

            public DeviceStreamData getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private DeviceStreamData(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                hardwareId_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                streamId_ = input.readBytes();
                                break;
                            }
                            case 25: {
                                bitField0_ |= 0x00000004;
                                sequenceNumber_ = input.readFixed64();
                                break;
                            }
                            case 34: {
                                bitField0_ |= 0x00000008;
                                data_ = input.readBytes();
                                break;
                            }
                            case 41: {
                                bitField0_ |= 0x00000010;
                                eventDate_ = input.readFixed64();
                                break;
                            }
                            case 50: {
                                if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                                    metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>();
                                    mutable_bitField0_ |= 0x00000020;
                                }
                                metadata_.add(input.readMessage(Sitewhere.Model.Metadata.PARSER, extensionRegistry));
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                        metadata_ = java.util.Collections.unmodifiableList(metadata_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Model_DeviceStreamData_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Model_DeviceStreamData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Model.DeviceStreamData.class, Sitewhere.Model.DeviceStreamData.Builder.class);
            }

            public static com.google.protobuf.Parser<DeviceStreamData> PARSER =
                    new com.google.protobuf.AbstractParser<DeviceStreamData>() {
                        public DeviceStreamData parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new DeviceStreamData(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<DeviceStreamData> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string hardwareId = 1;
            public static final int HARDWAREID_FIELD_NUMBER = 1;
            private java.lang.Object hardwareId_;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public boolean hasHardwareId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public java.lang.String getHardwareId() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        hardwareId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getHardwareIdBytes() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hardwareId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required string streamId = 2;
            public static final int STREAMID_FIELD_NUMBER = 2;
            private java.lang.Object streamId_;
            /**
             * <code>required string streamId = 2;</code>
             */
            public boolean hasStreamId() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string streamId = 2;</code>
             */
            public java.lang.String getStreamId() {
                java.lang.Object ref = streamId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        streamId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string streamId = 2;</code>
             */
            public com.google.protobuf.ByteString
            getStreamIdBytes() {
                java.lang.Object ref = streamId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    streamId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required fixed64 sequenceNumber = 3;
            public static final int SEQUENCENUMBER_FIELD_NUMBER = 3;
            private long sequenceNumber_;
            /**
             * <code>required fixed64 sequenceNumber = 3;</code>
             */
            public boolean hasSequenceNumber() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required fixed64 sequenceNumber = 3;</code>
             */
            public long getSequenceNumber() {
                return sequenceNumber_;
            }

            // required bytes data = 4;
            public static final int DATA_FIELD_NUMBER = 4;
            private com.google.protobuf.ByteString data_;
            /**
             * <code>required bytes data = 4;</code>
             */
            public boolean hasData() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>required bytes data = 4;</code>
             */
            public com.google.protobuf.ByteString getData() {
                return data_;
            }

            // optional fixed64 eventDate = 5;
            public static final int EVENTDATE_FIELD_NUMBER = 5;
            private long eventDate_;
            /**
             * <code>optional fixed64 eventDate = 5;</code>
             */
            public boolean hasEventDate() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional fixed64 eventDate = 5;</code>
             */
            public long getEventDate() {
                return eventDate_;
            }

            // repeated .Model.Metadata metadata = 6;
            public static final int METADATA_FIELD_NUMBER = 6;
            private java.util.List<Sitewhere.Model.Metadata> metadata_;
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public int getMetadataCount() {
                return metadata_.size();
            }
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public Sitewhere.Model.Metadata getMetadata(int index) {
                return metadata_.get(index);
            }
            /**
             * <code>repeated .Model.Metadata metadata = 6;</code>
             */
            public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index) {
                return metadata_.get(index);
            }

            private void initFields() {
                hardwareId_ = "";
                streamId_ = "";
                sequenceNumber_ = 0L;
                data_ = com.google.protobuf.ByteString.EMPTY;
                eventDate_ = 0L;
                metadata_ = java.util.Collections.emptyList();
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasHardwareId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasStreamId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasSequenceNumber()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasData()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                for (int i = 0; i < getMetadataCount(); i++) {
                    if (!getMetadata(i).isInitialized()) {
                        memoizedIsInitialized = 0;
                        return false;
                    }
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getStreamIdBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeFixed64(3, sequenceNumber_);
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    output.writeBytes(4, data_);
                }
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    output.writeFixed64(5, eventDate_);
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    output.writeMessage(6, metadata_.get(i));
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getStreamIdBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeFixed64Size(3, sequenceNumber_);
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(4, data_);
                }
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeFixed64Size(5, eventDate_);
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(6, metadata_.get(i));
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Model.DeviceStreamData parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceStreamData parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceStreamData parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Model.DeviceStreamData parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceStreamData parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceStreamData parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceStreamData parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Model.DeviceStreamData parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Model.DeviceStreamData parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Model.DeviceStreamData parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Model.DeviceStreamData prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Model.DeviceStreamData}
             *
             * <pre>
             * A chunk of streaming data.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Model.DeviceStreamDataOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Model_DeviceStreamData_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Model_DeviceStreamData_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Model.DeviceStreamData.class, Sitewhere.Model.DeviceStreamData.Builder.class);
                }

                // Construct using Sitewhere.Model.DeviceStreamData.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                        getMetadataFieldBuilder();
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    hardwareId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    streamId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    sequenceNumber_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000004);
                    data_ = com.google.protobuf.ByteString.EMPTY;
                    bitField0_ = (bitField0_ & ~0x00000008);
                    eventDate_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000010);
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000020);
                    } else {
                        metadataBuilder_.clear();
                    }
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Model_DeviceStreamData_descriptor;
                }

                public Sitewhere.Model.DeviceStreamData getDefaultInstanceForType() {
                    return Sitewhere.Model.DeviceStreamData.getDefaultInstance();
                }

                public Sitewhere.Model.DeviceStreamData build() {
                    Sitewhere.Model.DeviceStreamData result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Model.DeviceStreamData buildPartial() {
                    Sitewhere.Model.DeviceStreamData result = new Sitewhere.Model.DeviceStreamData(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.hardwareId_ = hardwareId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.streamId_ = streamId_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.sequenceNumber_ = sequenceNumber_;
                    if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                        to_bitField0_ |= 0x00000008;
                    }
                    result.data_ = data_;
                    if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                        to_bitField0_ |= 0x00000010;
                    }
                    result.eventDate_ = eventDate_;
                    if (metadataBuilder_ == null) {
                        if (((bitField0_ & 0x00000020) == 0x00000020)) {
                            metadata_ = java.util.Collections.unmodifiableList(metadata_);
                            bitField0_ = (bitField0_ & ~0x00000020);
                        }
                        result.metadata_ = metadata_;
                    } else {
                        result.metadata_ = metadataBuilder_.build();
                    }
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Model.DeviceStreamData) {
                        return mergeFrom((Sitewhere.Model.DeviceStreamData)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Model.DeviceStreamData other) {
                    if (other == Sitewhere.Model.DeviceStreamData.getDefaultInstance()) return this;
                    if (other.hasHardwareId()) {
                        bitField0_ |= 0x00000001;
                        hardwareId_ = other.hardwareId_;
                        onChanged();
                    }
                    if (other.hasStreamId()) {
                        bitField0_ |= 0x00000002;
                        streamId_ = other.streamId_;
                        onChanged();
                    }
                    if (other.hasSequenceNumber()) {
                        setSequenceNumber(other.getSequenceNumber());
                    }
                    if (other.hasData()) {
                        setData(other.getData());
                    }
                    if (other.hasEventDate()) {
                        setEventDate(other.getEventDate());
                    }
                    if (metadataBuilder_ == null) {
                        if (!other.metadata_.isEmpty()) {
                            if (metadata_.isEmpty()) {
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000020);
                            } else {
                                ensureMetadataIsMutable();
                                metadata_.addAll(other.metadata_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.metadata_.isEmpty()) {
                            if (metadataBuilder_.isEmpty()) {
                                metadataBuilder_.dispose();
                                metadataBuilder_ = null;
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000020);
                                metadataBuilder_ =
                                        com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                                getMetadataFieldBuilder() : null;
                            } else {
                                metadataBuilder_.addAllMessages(other.metadata_);
                            }
                        }
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasHardwareId()) {

                        return false;
                    }
                    if (!hasStreamId()) {

                        return false;
                    }
                    if (!hasSequenceNumber()) {

                        return false;
                    }
                    if (!hasData()) {

                        return false;
                    }
                    for (int i = 0; i < getMetadataCount(); i++) {
                        if (!getMetadata(i).isInitialized()) {

                            return false;
                        }
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Model.DeviceStreamData parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Model.DeviceStreamData) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string hardwareId = 1;
                private java.lang.Object hardwareId_ = "";
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public boolean hasHardwareId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public java.lang.String getHardwareId() {
                    java.lang.Object ref = hardwareId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        hardwareId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getHardwareIdBytes() {
                    java.lang.Object ref = hardwareId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        hardwareId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder clearHardwareId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    hardwareId_ = getDefaultInstance().getHardwareId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }

                // required string streamId = 2;
                private java.lang.Object streamId_ = "";
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public boolean hasStreamId() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public java.lang.String getStreamId() {
                    java.lang.Object ref = streamId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        streamId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getStreamIdBytes() {
                    java.lang.Object ref = streamId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        streamId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder setStreamId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    streamId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder clearStreamId() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    streamId_ = getDefaultInstance().getStreamId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder setStreamIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    streamId_ = value;
                    onChanged();
                    return this;
                }

                // required fixed64 sequenceNumber = 3;
                private long sequenceNumber_ ;
                /**
                 * <code>required fixed64 sequenceNumber = 3;</code>
                 */
                public boolean hasSequenceNumber() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>required fixed64 sequenceNumber = 3;</code>
                 */
                public long getSequenceNumber() {
                    return sequenceNumber_;
                }
                /**
                 * <code>required fixed64 sequenceNumber = 3;</code>
                 */
                public Builder setSequenceNumber(long value) {
                    bitField0_ |= 0x00000004;
                    sequenceNumber_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required fixed64 sequenceNumber = 3;</code>
                 */
                public Builder clearSequenceNumber() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    sequenceNumber_ = 0L;
                    onChanged();
                    return this;
                }

                // required bytes data = 4;
                private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
                /**
                 * <code>required bytes data = 4;</code>
                 */
                public boolean hasData() {
                    return ((bitField0_ & 0x00000008) == 0x00000008);
                }
                /**
                 * <code>required bytes data = 4;</code>
                 */
                public com.google.protobuf.ByteString getData() {
                    return data_;
                }
                /**
                 * <code>required bytes data = 4;</code>
                 */
                public Builder setData(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000008;
                    data_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required bytes data = 4;</code>
                 */
                public Builder clearData() {
                    bitField0_ = (bitField0_ & ~0x00000008);
                    data_ = getDefaultInstance().getData();
                    onChanged();
                    return this;
                }

                // optional fixed64 eventDate = 5;
                private long eventDate_ ;
                /**
                 * <code>optional fixed64 eventDate = 5;</code>
                 */
                public boolean hasEventDate() {
                    return ((bitField0_ & 0x00000010) == 0x00000010);
                }
                /**
                 * <code>optional fixed64 eventDate = 5;</code>
                 */
                public long getEventDate() {
                    return eventDate_;
                }
                /**
                 * <code>optional fixed64 eventDate = 5;</code>
                 */
                public Builder setEventDate(long value) {
                    bitField0_ |= 0x00000010;
                    eventDate_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional fixed64 eventDate = 5;</code>
                 */
                public Builder clearEventDate() {
                    bitField0_ = (bitField0_ & ~0x00000010);
                    eventDate_ = 0L;
                    onChanged();
                    return this;
                }

                // repeated .Model.Metadata metadata = 6;
                private java.util.List<Sitewhere.Model.Metadata> metadata_ =
                        java.util.Collections.emptyList();
                private void ensureMetadataIsMutable() {
                    if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                        metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>(metadata_);
                        bitField0_ |= 0x00000020;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder> metadataBuilder_;

                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                    if (metadataBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(metadata_);
                    } else {
                        return metadataBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public int getMetadataCount() {
                    if (metadataBuilder_ == null) {
                        return metadata_.size();
                    } else {
                        return metadataBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.Metadata getMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);
                    } else {
                        return metadataBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.set(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addMetadata(Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addMetadata(
                        Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder addAllMetadata(
                        java.lang.Iterable<? extends Sitewhere.Model.Metadata> values) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        super.addAll(values, metadata_);
                        onChanged();
                    } else {
                        metadataBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder clearMetadata() {
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000020);
                        onChanged();
                    } else {
                        metadataBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Builder removeMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.remove(index);
                        onChanged();
                    } else {
                        metadataBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.Metadata.Builder getMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                        int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);  } else {
                        return metadataBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
                getMetadataOrBuilderList() {
                    if (metadataBuilder_ != null) {
                        return metadataBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(metadata_);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder() {
                    return getMetadataFieldBuilder().addBuilder(
                            Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().addBuilder(
                            index, Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 6;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata.Builder>
                getMetadataBuilderList() {
                    return getMetadataFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>
                getMetadataFieldBuilder() {
                    if (metadataBuilder_ == null) {
                        metadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                                Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>(
                                metadata_,
                                ((bitField0_ & 0x00000020) == 0x00000020),
                                getParentForChildren(),
                                isClean());
                        metadata_ = null;
                    }
                    return metadataBuilder_;
                }

                // @@protoc_insertion_point(builder_scope:Model.DeviceStreamData)
            }

            static {
                defaultInstance = new DeviceStreamData(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Model.DeviceStreamData)
        }

        private void initFields() {
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Sitewhere.Model parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Sitewhere.Model parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Sitewhere.Model parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Sitewhere.Model parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Sitewhere.Model parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Sitewhere.Model parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Sitewhere.Model parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Sitewhere.Model parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Sitewhere.Model parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Sitewhere.Model parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Sitewhere.Model prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code Model}
         *
         * <pre>
         * Model Objects
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Sitewhere.ModelOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Model_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Model_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Model.class, Sitewhere.Model.Builder.class);
            }

            // Construct using Sitewhere.Model.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Sitewhere.internal_static_Model_descriptor;
            }

            public Sitewhere.Model getDefaultInstanceForType() {
                return Sitewhere.Model.getDefaultInstance();
            }

            public Sitewhere.Model build() {
                Sitewhere.Model result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Sitewhere.Model buildPartial() {
                Sitewhere.Model result = new Sitewhere.Model(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Sitewhere.Model) {
                    return mergeFrom((Sitewhere.Model)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Sitewhere.Model other) {
                if (other == Sitewhere.Model.getDefaultInstance()) return this;
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Sitewhere.Model parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Sitewhere.Model) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Model)
        }

        static {
            defaultInstance = new Model(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:Model)
    }

    public interface SiteWhereOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code SiteWhere}
     *
     * <pre>
     * Commands sent from a device to SiteWhere.
     * </pre>
     */
    public static final class SiteWhere extends
            com.google.protobuf.GeneratedMessage
            implements SiteWhereOrBuilder {
        // Use SiteWhere.newBuilder() to construct.
        private SiteWhere(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private SiteWhere(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final SiteWhere defaultInstance;
        public static SiteWhere getDefaultInstance() {
            return defaultInstance;
        }

        public SiteWhere getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private SiteWhere(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Sitewhere.internal_static_SiteWhere_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Sitewhere.internal_static_SiteWhere_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Sitewhere.SiteWhere.class, Sitewhere.SiteWhere.Builder.class);
        }

        public static com.google.protobuf.Parser<SiteWhere> PARSER =
                new com.google.protobuf.AbstractParser<SiteWhere>() {
                    public SiteWhere parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SiteWhere(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<SiteWhere> getParserForType() {
            return PARSER;
        }

        /**
         * Protobuf enum {@code SiteWhere.Command}
         */
        public enum Command
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>SEND_REGISTRATION = 1;</code>
             */
            SEND_REGISTRATION(0, 1),
            /**
             * <code>SEND_ACKNOWLEDGEMENT = 2;</code>
             */
            SEND_ACKNOWLEDGEMENT(1, 2),
            /**
             * <code>SEND_DEVICE_LOCATION = 3;</code>
             */
            SEND_DEVICE_LOCATION(2, 3),
            /**
             * <code>SEND_DEVICE_ALERT = 4;</code>
             */
            SEND_DEVICE_ALERT(3, 4),
            /**
             * <code>SEND_DEVICE_MEASUREMENTS = 5;</code>
             */
            SEND_DEVICE_MEASUREMENTS(4, 5),
            /**
             * <code>SEND_DEVICE_STREAM = 6;</code>
             */
            SEND_DEVICE_STREAM(5, 6),
            /**
             * <code>SEND_DEVICE_STREAM_DATA = 7;</code>
             */
            SEND_DEVICE_STREAM_DATA(6, 7),
            /**
             * <code>REQUEST_DEVICE_STREAM_DATA = 8;</code>
             */
            REQUEST_DEVICE_STREAM_DATA(7, 8),
            ;

            /**
             * <code>SEND_REGISTRATION = 1;</code>
             */
            public static final int SEND_REGISTRATION_VALUE = 1;
            /**
             * <code>SEND_ACKNOWLEDGEMENT = 2;</code>
             */
            public static final int SEND_ACKNOWLEDGEMENT_VALUE = 2;
            /**
             * <code>SEND_DEVICE_LOCATION = 3;</code>
             */
            public static final int SEND_DEVICE_LOCATION_VALUE = 3;
            /**
             * <code>SEND_DEVICE_ALERT = 4;</code>
             */
            public static final int SEND_DEVICE_ALERT_VALUE = 4;
            /**
             * <code>SEND_DEVICE_MEASUREMENTS = 5;</code>
             */
            public static final int SEND_DEVICE_MEASUREMENTS_VALUE = 5;
            /**
             * <code>SEND_DEVICE_STREAM = 6;</code>
             */
            public static final int SEND_DEVICE_STREAM_VALUE = 6;
            /**
             * <code>SEND_DEVICE_STREAM_DATA = 7;</code>
             */
            public static final int SEND_DEVICE_STREAM_DATA_VALUE = 7;
            /**
             * <code>REQUEST_DEVICE_STREAM_DATA = 8;</code>
             */
            public static final int REQUEST_DEVICE_STREAM_DATA_VALUE = 8;


            public final int getNumber() { return value; }

            public static Command valueOf(int value) {
                switch (value) {
                    case 1: return SEND_REGISTRATION;
                    case 2: return SEND_ACKNOWLEDGEMENT;
                    case 3: return SEND_DEVICE_LOCATION;
                    case 4: return SEND_DEVICE_ALERT;
                    case 5: return SEND_DEVICE_MEASUREMENTS;
                    case 6: return SEND_DEVICE_STREAM;
                    case 7: return SEND_DEVICE_STREAM_DATA;
                    case 8: return REQUEST_DEVICE_STREAM_DATA;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Command>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<Command>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Command>() {
                        public Command findValueByNumber(int number) {
                            return Command.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Sitewhere.SiteWhere.getDescriptor().getEnumTypes().get(0);
            }

            private static final Command[] VALUES = values();

            public static Command valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private Command(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:SiteWhere.Command)
        }

        public interface HeaderOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required .SiteWhere.Command command = 1;
            /**
             * <code>required .SiteWhere.Command command = 1;</code>
             */
            boolean hasCommand();
            /**
             * <code>required .SiteWhere.Command command = 1;</code>
             */
            Sitewhere.SiteWhere.Command getCommand();

            // optional string originator = 2;
            /**
             * <code>optional string originator = 2;</code>
             */
            boolean hasOriginator();
            /**
             * <code>optional string originator = 2;</code>
             */
            java.lang.String getOriginator();
            /**
             * <code>optional string originator = 2;</code>
             */
            com.google.protobuf.ByteString
            getOriginatorBytes();
        }
        /**
         * Protobuf type {@code SiteWhere.Header}
         *
         * <pre>
         * Header contains the command and originator.
         * </pre>
         */
        public static final class Header extends
                com.google.protobuf.GeneratedMessage
                implements HeaderOrBuilder {
            // Use Header.newBuilder() to construct.
            private Header(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private Header(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final Header defaultInstance;
            public static Header getDefaultInstance() {
                return defaultInstance;
            }

            public Header getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private Header(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 8: {
                                int rawValue = input.readEnum();
                                Sitewhere.SiteWhere.Command value = Sitewhere.SiteWhere.Command.valueOf(rawValue);
                                if (value == null) {
                                    unknownFields.mergeVarintField(1, rawValue);
                                } else {
                                    bitField0_ |= 0x00000001;
                                    command_ = value;
                                }
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                originator_ = input.readBytes();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_SiteWhere_Header_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_SiteWhere_Header_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.SiteWhere.Header.class, Sitewhere.SiteWhere.Header.Builder.class);
            }

            public static com.google.protobuf.Parser<Header> PARSER =
                    new com.google.protobuf.AbstractParser<Header>() {
                        public Header parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new Header(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<Header> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required .SiteWhere.Command command = 1;
            public static final int COMMAND_FIELD_NUMBER = 1;
            private Sitewhere.SiteWhere.Command command_;
            /**
             * <code>required .SiteWhere.Command command = 1;</code>
             */
            public boolean hasCommand() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required .SiteWhere.Command command = 1;</code>
             */
            public Sitewhere.SiteWhere.Command getCommand() {
                return command_;
            }

            // optional string originator = 2;
            public static final int ORIGINATOR_FIELD_NUMBER = 2;
            private java.lang.Object originator_;
            /**
             * <code>optional string originator = 2;</code>
             */
            public boolean hasOriginator() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string originator = 2;</code>
             */
            public java.lang.String getOriginator() {
                java.lang.Object ref = originator_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        originator_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>optional string originator = 2;</code>
             */
            public com.google.protobuf.ByteString
            getOriginatorBytes() {
                java.lang.Object ref = originator_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    originator_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private void initFields() {
                command_ = Sitewhere.SiteWhere.Command.SEND_REGISTRATION;
                originator_ = "";
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasCommand()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeEnum(1, command_.getNumber());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getOriginatorBytes());
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(1, command_.getNumber());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getOriginatorBytes());
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.SiteWhere.Header parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.SiteWhere.Header parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.Header parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.SiteWhere.Header parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.Header parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.SiteWhere.Header parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.Header parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.SiteWhere.Header parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.Header parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.SiteWhere.Header parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.SiteWhere.Header prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SiteWhere.Header}
             *
             * <pre>
             * Header contains the command and originator.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.SiteWhere.HeaderOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_SiteWhere_Header_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_SiteWhere_Header_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.SiteWhere.Header.class, Sitewhere.SiteWhere.Header.Builder.class);
                }

                // Construct using Sitewhere.SiteWhere.Header.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    command_ = Sitewhere.SiteWhere.Command.SEND_REGISTRATION;
                    bitField0_ = (bitField0_ & ~0x00000001);
                    originator_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_SiteWhere_Header_descriptor;
                }

                public Sitewhere.SiteWhere.Header getDefaultInstanceForType() {
                    return Sitewhere.SiteWhere.Header.getDefaultInstance();
                }

                public Sitewhere.SiteWhere.Header build() {
                    Sitewhere.SiteWhere.Header result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.SiteWhere.Header buildPartial() {
                    Sitewhere.SiteWhere.Header result = new Sitewhere.SiteWhere.Header(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.command_ = command_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.originator_ = originator_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.SiteWhere.Header) {
                        return mergeFrom((Sitewhere.SiteWhere.Header)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.SiteWhere.Header other) {
                    if (other == Sitewhere.SiteWhere.Header.getDefaultInstance()) return this;
                    if (other.hasCommand()) {
                        setCommand(other.getCommand());
                    }
                    if (other.hasOriginator()) {
                        bitField0_ |= 0x00000002;
                        originator_ = other.originator_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasCommand()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.SiteWhere.Header parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.SiteWhere.Header) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required .SiteWhere.Command command = 1;
                private Sitewhere.SiteWhere.Command command_ = Sitewhere.SiteWhere.Command.SEND_REGISTRATION;
                /**
                 * <code>required .SiteWhere.Command command = 1;</code>
                 */
                public boolean hasCommand() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required .SiteWhere.Command command = 1;</code>
                 */
                public Sitewhere.SiteWhere.Command getCommand() {
                    return command_;
                }
                /**
                 * <code>required .SiteWhere.Command command = 1;</code>
                 */
                public Builder setCommand(Sitewhere.SiteWhere.Command value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    command_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required .SiteWhere.Command command = 1;</code>
                 */
                public Builder clearCommand() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    command_ = Sitewhere.SiteWhere.Command.SEND_REGISTRATION;
                    onChanged();
                    return this;
                }

                // optional string originator = 2;
                private java.lang.Object originator_ = "";
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public boolean hasOriginator() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public java.lang.String getOriginator() {
                    java.lang.Object ref = originator_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        originator_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getOriginatorBytes() {
                    java.lang.Object ref = originator_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        originator_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public Builder setOriginator(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    originator_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public Builder clearOriginator() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    originator_ = getDefaultInstance().getOriginator();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public Builder setOriginatorBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    originator_ = value;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:SiteWhere.Header)
            }

            static {
                defaultInstance = new Header(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:SiteWhere.Header)
        }

        public interface RegisterDeviceOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string hardwareId = 1;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            boolean hasHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            java.lang.String getHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            com.google.protobuf.ByteString
            getHardwareIdBytes();

            // required string specificationToken = 2;
            /**
             * <code>required string specificationToken = 2;</code>
             */
            boolean hasSpecificationToken();
            /**
             * <code>required string specificationToken = 2;</code>
             */
            java.lang.String getSpecificationToken();
            /**
             * <code>required string specificationToken = 2;</code>
             */
            com.google.protobuf.ByteString
            getSpecificationTokenBytes();

            // repeated .Model.Metadata metadata = 3;
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            java.util.List<Sitewhere.Model.Metadata>
            getMetadataList();
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            Sitewhere.Model.Metadata getMetadata(int index);
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            int getMetadataCount();
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList();
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index);

            // optional string siteToken = 4;
            /**
             * <code>optional string siteToken = 4;</code>
             */
            boolean hasSiteToken();
            /**
             * <code>optional string siteToken = 4;</code>
             */
            java.lang.String getSiteToken();
            /**
             * <code>optional string siteToken = 4;</code>
             */
            com.google.protobuf.ByteString
            getSiteTokenBytes();
        }
        /**
         * Protobuf type {@code SiteWhere.RegisterDevice}
         *
         * <pre>
         * Register a device with SiteWhere.
         * </pre>
         */
        public static final class RegisterDevice extends
                com.google.protobuf.GeneratedMessage
                implements RegisterDeviceOrBuilder {
            // Use RegisterDevice.newBuilder() to construct.
            private RegisterDevice(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private RegisterDevice(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final RegisterDevice defaultInstance;
            public static RegisterDevice getDefaultInstance() {
                return defaultInstance;
            }

            public RegisterDevice getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private RegisterDevice(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                hardwareId_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                specificationToken_ = input.readBytes();
                                break;
                            }
                            case 26: {
                                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                                    metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>();
                                    mutable_bitField0_ |= 0x00000004;
                                }
                                metadata_.add(input.readMessage(Sitewhere.Model.Metadata.PARSER, extensionRegistry));
                                break;
                            }
                            case 34: {
                                bitField0_ |= 0x00000004;
                                siteToken_ = input.readBytes();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                        metadata_ = java.util.Collections.unmodifiableList(metadata_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_SiteWhere_RegisterDevice_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_SiteWhere_RegisterDevice_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.SiteWhere.RegisterDevice.class, Sitewhere.SiteWhere.RegisterDevice.Builder.class);
            }

            public static com.google.protobuf.Parser<RegisterDevice> PARSER =
                    new com.google.protobuf.AbstractParser<RegisterDevice>() {
                        public RegisterDevice parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new RegisterDevice(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<RegisterDevice> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string hardwareId = 1;
            public static final int HARDWAREID_FIELD_NUMBER = 1;
            private java.lang.Object hardwareId_;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public boolean hasHardwareId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public java.lang.String getHardwareId() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        hardwareId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getHardwareIdBytes() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hardwareId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required string specificationToken = 2;
            public static final int SPECIFICATIONTOKEN_FIELD_NUMBER = 2;
            private java.lang.Object specificationToken_;
            /**
             * <code>required string specificationToken = 2;</code>
             */
            public boolean hasSpecificationToken() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string specificationToken = 2;</code>
             */
            public java.lang.String getSpecificationToken() {
                java.lang.Object ref = specificationToken_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        specificationToken_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string specificationToken = 2;</code>
             */
            public com.google.protobuf.ByteString
            getSpecificationTokenBytes() {
                java.lang.Object ref = specificationToken_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    specificationToken_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // repeated .Model.Metadata metadata = 3;
            public static final int METADATA_FIELD_NUMBER = 3;
            private java.util.List<Sitewhere.Model.Metadata> metadata_;
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
            getMetadataOrBuilderList() {
                return metadata_;
            }
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            public int getMetadataCount() {
                return metadata_.size();
            }
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            public Sitewhere.Model.Metadata getMetadata(int index) {
                return metadata_.get(index);
            }
            /**
             * <code>repeated .Model.Metadata metadata = 3;</code>
             */
            public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                    int index) {
                return metadata_.get(index);
            }

            // optional string siteToken = 4;
            public static final int SITETOKEN_FIELD_NUMBER = 4;
            private java.lang.Object siteToken_;
            /**
             * <code>optional string siteToken = 4;</code>
             */
            public boolean hasSiteToken() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional string siteToken = 4;</code>
             */
            public java.lang.String getSiteToken() {
                java.lang.Object ref = siteToken_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        siteToken_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>optional string siteToken = 4;</code>
             */
            public com.google.protobuf.ByteString
            getSiteTokenBytes() {
                java.lang.Object ref = siteToken_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    siteToken_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private void initFields() {
                hardwareId_ = "";
                specificationToken_ = "";
                metadata_ = java.util.Collections.emptyList();
                siteToken_ = "";
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasHardwareId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasSpecificationToken()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                for (int i = 0; i < getMetadataCount(); i++) {
                    if (!getMetadata(i).isInitialized()) {
                        memoizedIsInitialized = 0;
                        return false;
                    }
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getSpecificationTokenBytes());
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    output.writeMessage(3, metadata_.get(i));
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeBytes(4, getSiteTokenBytes());
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getSpecificationTokenBytes());
                }
                for (int i = 0; i < metadata_.size(); i++) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(3, metadata_.get(i));
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(4, getSiteTokenBytes());
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.SiteWhere.RegisterDevice parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.SiteWhere.RegisterDevice parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.SiteWhere.RegisterDevice prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SiteWhere.RegisterDevice}
             *
             * <pre>
             * Register a device with SiteWhere.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.SiteWhere.RegisterDeviceOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_SiteWhere_RegisterDevice_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_SiteWhere_RegisterDevice_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.SiteWhere.RegisterDevice.class, Sitewhere.SiteWhere.RegisterDevice.Builder.class);
                }

                // Construct using Sitewhere.SiteWhere.RegisterDevice.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                        getMetadataFieldBuilder();
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    hardwareId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    specificationToken_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000004);
                    } else {
                        metadataBuilder_.clear();
                    }
                    siteToken_ = "";
                    bitField0_ = (bitField0_ & ~0x00000008);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_SiteWhere_RegisterDevice_descriptor;
                }

                public Sitewhere.SiteWhere.RegisterDevice getDefaultInstanceForType() {
                    return Sitewhere.SiteWhere.RegisterDevice.getDefaultInstance();
                }

                public Sitewhere.SiteWhere.RegisterDevice build() {
                    Sitewhere.SiteWhere.RegisterDevice result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.SiteWhere.RegisterDevice buildPartial() {
                    Sitewhere.SiteWhere.RegisterDevice result = new Sitewhere.SiteWhere.RegisterDevice(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.hardwareId_ = hardwareId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.specificationToken_ = specificationToken_;
                    if (metadataBuilder_ == null) {
                        if (((bitField0_ & 0x00000004) == 0x00000004)) {
                            metadata_ = java.util.Collections.unmodifiableList(metadata_);
                            bitField0_ = (bitField0_ & ~0x00000004);
                        }
                        result.metadata_ = metadata_;
                    } else {
                        result.metadata_ = metadataBuilder_.build();
                    }
                    if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.siteToken_ = siteToken_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.SiteWhere.RegisterDevice) {
                        return mergeFrom((Sitewhere.SiteWhere.RegisterDevice)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.SiteWhere.RegisterDevice other) {
                    if (other == Sitewhere.SiteWhere.RegisterDevice.getDefaultInstance()) return this;
                    if (other.hasHardwareId()) {
                        bitField0_ |= 0x00000001;
                        hardwareId_ = other.hardwareId_;
                        onChanged();
                    }
                    if (other.hasSpecificationToken()) {
                        bitField0_ |= 0x00000002;
                        specificationToken_ = other.specificationToken_;
                        onChanged();
                    }
                    if (metadataBuilder_ == null) {
                        if (!other.metadata_.isEmpty()) {
                            if (metadata_.isEmpty()) {
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000004);
                            } else {
                                ensureMetadataIsMutable();
                                metadata_.addAll(other.metadata_);
                            }
                            onChanged();
                        }
                    } else {
                        if (!other.metadata_.isEmpty()) {
                            if (metadataBuilder_.isEmpty()) {
                                metadataBuilder_.dispose();
                                metadataBuilder_ = null;
                                metadata_ = other.metadata_;
                                bitField0_ = (bitField0_ & ~0x00000004);
                                metadataBuilder_ =
                                        com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                                getMetadataFieldBuilder() : null;
                            } else {
                                metadataBuilder_.addAllMessages(other.metadata_);
                            }
                        }
                    }
                    if (other.hasSiteToken()) {
                        bitField0_ |= 0x00000008;
                        siteToken_ = other.siteToken_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasHardwareId()) {

                        return false;
                    }
                    if (!hasSpecificationToken()) {

                        return false;
                    }
                    for (int i = 0; i < getMetadataCount(); i++) {
                        if (!getMetadata(i).isInitialized()) {

                            return false;
                        }
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.SiteWhere.RegisterDevice parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.SiteWhere.RegisterDevice) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string hardwareId = 1;
                private java.lang.Object hardwareId_ = "";
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public boolean hasHardwareId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public java.lang.String getHardwareId() {
                    java.lang.Object ref = hardwareId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        hardwareId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getHardwareIdBytes() {
                    java.lang.Object ref = hardwareId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        hardwareId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder clearHardwareId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    hardwareId_ = getDefaultInstance().getHardwareId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }

                // required string specificationToken = 2;
                private java.lang.Object specificationToken_ = "";
                /**
                 * <code>required string specificationToken = 2;</code>
                 */
                public boolean hasSpecificationToken() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required string specificationToken = 2;</code>
                 */
                public java.lang.String getSpecificationToken() {
                    java.lang.Object ref = specificationToken_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        specificationToken_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string specificationToken = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getSpecificationTokenBytes() {
                    java.lang.Object ref = specificationToken_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        specificationToken_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string specificationToken = 2;</code>
                 */
                public Builder setSpecificationToken(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    specificationToken_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string specificationToken = 2;</code>
                 */
                public Builder clearSpecificationToken() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    specificationToken_ = getDefaultInstance().getSpecificationToken();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string specificationToken = 2;</code>
                 */
                public Builder setSpecificationTokenBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    specificationToken_ = value;
                    onChanged();
                    return this;
                }

                // repeated .Model.Metadata metadata = 3;
                private java.util.List<Sitewhere.Model.Metadata> metadata_ =
                        java.util.Collections.emptyList();
                private void ensureMetadataIsMutable() {
                    if (!((bitField0_ & 0x00000004) == 0x00000004)) {
                        metadata_ = new java.util.ArrayList<Sitewhere.Model.Metadata>(metadata_);
                        bitField0_ |= 0x00000004;
                    }
                }

                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder> metadataBuilder_;

                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata> getMetadataList() {
                    if (metadataBuilder_ == null) {
                        return java.util.Collections.unmodifiableList(metadata_);
                    } else {
                        return metadataBuilder_.getMessageList();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public int getMetadataCount() {
                    if (metadataBuilder_ == null) {
                        return metadata_.size();
                    } else {
                        return metadataBuilder_.getCount();
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Sitewhere.Model.Metadata getMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);
                    } else {
                        return metadataBuilder_.getMessage(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.set(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder setMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder addMetadata(Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata value) {
                    if (metadataBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureMetadataIsMutable();
                        metadata_.add(index, value);
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, value);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder addMetadata(
                        Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder addMetadata(
                        int index, Sitewhere.Model.Metadata.Builder builderForValue) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        metadataBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder addAllMetadata(
                        java.lang.Iterable<? extends Sitewhere.Model.Metadata> values) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        super.addAll(values, metadata_);
                        onChanged();
                    } else {
                        metadataBuilder_.addAllMessages(values);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder clearMetadata() {
                    if (metadataBuilder_ == null) {
                        metadata_ = java.util.Collections.emptyList();
                        bitField0_ = (bitField0_ & ~0x00000004);
                        onChanged();
                    } else {
                        metadataBuilder_.clear();
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Builder removeMetadata(int index) {
                    if (metadataBuilder_ == null) {
                        ensureMetadataIsMutable();
                        metadata_.remove(index);
                        onChanged();
                    } else {
                        metadataBuilder_.remove(index);
                    }
                    return this;
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Sitewhere.Model.Metadata.Builder getMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().getBuilder(index);
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Sitewhere.Model.MetadataOrBuilder getMetadataOrBuilder(
                        int index) {
                    if (metadataBuilder_ == null) {
                        return metadata_.get(index);  } else {
                        return metadataBuilder_.getMessageOrBuilder(index);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public java.util.List<? extends Sitewhere.Model.MetadataOrBuilder>
                getMetadataOrBuilderList() {
                    if (metadataBuilder_ != null) {
                        return metadataBuilder_.getMessageOrBuilderList();
                    } else {
                        return java.util.Collections.unmodifiableList(metadata_);
                    }
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder() {
                    return getMetadataFieldBuilder().addBuilder(
                            Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public Sitewhere.Model.Metadata.Builder addMetadataBuilder(
                        int index) {
                    return getMetadataFieldBuilder().addBuilder(
                            index, Sitewhere.Model.Metadata.getDefaultInstance());
                }
                /**
                 * <code>repeated .Model.Metadata metadata = 3;</code>
                 */
                public java.util.List<Sitewhere.Model.Metadata.Builder>
                getMetadataBuilderList() {
                    return getMetadataFieldBuilder().getBuilderList();
                }
                private com.google.protobuf.RepeatedFieldBuilder<
                        Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>
                getMetadataFieldBuilder() {
                    if (metadataBuilder_ == null) {
                        metadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                                Sitewhere.Model.Metadata, Sitewhere.Model.Metadata.Builder, Sitewhere.Model.MetadataOrBuilder>(
                                metadata_,
                                ((bitField0_ & 0x00000004) == 0x00000004),
                                getParentForChildren(),
                                isClean());
                        metadata_ = null;
                    }
                    return metadataBuilder_;
                }

                // optional string siteToken = 4;
                private java.lang.Object siteToken_ = "";
                /**
                 * <code>optional string siteToken = 4;</code>
                 */
                public boolean hasSiteToken() {
                    return ((bitField0_ & 0x00000008) == 0x00000008);
                }
                /**
                 * <code>optional string siteToken = 4;</code>
                 */
                public java.lang.String getSiteToken() {
                    java.lang.Object ref = siteToken_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        siteToken_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>optional string siteToken = 4;</code>
                 */
                public com.google.protobuf.ByteString
                getSiteTokenBytes() {
                    java.lang.Object ref = siteToken_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        siteToken_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>optional string siteToken = 4;</code>
                 */
                public Builder setSiteToken(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000008;
                    siteToken_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string siteToken = 4;</code>
                 */
                public Builder clearSiteToken() {
                    bitField0_ = (bitField0_ & ~0x00000008);
                    siteToken_ = getDefaultInstance().getSiteToken();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string siteToken = 4;</code>
                 */
                public Builder setSiteTokenBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000008;
                    siteToken_ = value;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:SiteWhere.RegisterDevice)
            }

            static {
                defaultInstance = new RegisterDevice(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:SiteWhere.RegisterDevice)
        }

        public interface AcknowledgeOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string hardwareId = 1;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            boolean hasHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            java.lang.String getHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            com.google.protobuf.ByteString
            getHardwareIdBytes();

            // optional string message = 2;
            /**
             * <code>optional string message = 2;</code>
             */
            boolean hasMessage();
            /**
             * <code>optional string message = 2;</code>
             */
            java.lang.String getMessage();
            /**
             * <code>optional string message = 2;</code>
             */
            com.google.protobuf.ByteString
            getMessageBytes();
        }
        /**
         * Protobuf type {@code SiteWhere.Acknowledge}
         *
         * <pre>
         * Acknowledge previous command.
         * </pre>
         */
        public static final class Acknowledge extends
                com.google.protobuf.GeneratedMessage
                implements AcknowledgeOrBuilder {
            // Use Acknowledge.newBuilder() to construct.
            private Acknowledge(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private Acknowledge(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final Acknowledge defaultInstance;
            public static Acknowledge getDefaultInstance() {
                return defaultInstance;
            }

            public Acknowledge getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private Acknowledge(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                hardwareId_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                message_ = input.readBytes();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_SiteWhere_Acknowledge_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_SiteWhere_Acknowledge_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.SiteWhere.Acknowledge.class, Sitewhere.SiteWhere.Acknowledge.Builder.class);
            }

            public static com.google.protobuf.Parser<Acknowledge> PARSER =
                    new com.google.protobuf.AbstractParser<Acknowledge>() {
                        public Acknowledge parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new Acknowledge(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<Acknowledge> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string hardwareId = 1;
            public static final int HARDWAREID_FIELD_NUMBER = 1;
            private java.lang.Object hardwareId_;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public boolean hasHardwareId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public java.lang.String getHardwareId() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        hardwareId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getHardwareIdBytes() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hardwareId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // optional string message = 2;
            public static final int MESSAGE_FIELD_NUMBER = 2;
            private java.lang.Object message_;
            /**
             * <code>optional string message = 2;</code>
             */
            public boolean hasMessage() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string message = 2;</code>
             */
            public java.lang.String getMessage() {
                java.lang.Object ref = message_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        message_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>optional string message = 2;</code>
             */
            public com.google.protobuf.ByteString
            getMessageBytes() {
                java.lang.Object ref = message_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private void initFields() {
                hardwareId_ = "";
                message_ = "";
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasHardwareId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getMessageBytes());
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getMessageBytes());
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.SiteWhere.Acknowledge parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.SiteWhere.Acknowledge parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.SiteWhere.Acknowledge prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SiteWhere.Acknowledge}
             *
             * <pre>
             * Acknowledge previous command.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.SiteWhere.AcknowledgeOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_SiteWhere_Acknowledge_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_SiteWhere_Acknowledge_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.SiteWhere.Acknowledge.class, Sitewhere.SiteWhere.Acknowledge.Builder.class);
                }

                // Construct using Sitewhere.SiteWhere.Acknowledge.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    hardwareId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    message_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_SiteWhere_Acknowledge_descriptor;
                }

                public Sitewhere.SiteWhere.Acknowledge getDefaultInstanceForType() {
                    return Sitewhere.SiteWhere.Acknowledge.getDefaultInstance();
                }

                public Sitewhere.SiteWhere.Acknowledge build() {
                    Sitewhere.SiteWhere.Acknowledge result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.SiteWhere.Acknowledge buildPartial() {
                    Sitewhere.SiteWhere.Acknowledge result = new Sitewhere.SiteWhere.Acknowledge(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.hardwareId_ = hardwareId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.message_ = message_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.SiteWhere.Acknowledge) {
                        return mergeFrom((Sitewhere.SiteWhere.Acknowledge)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.SiteWhere.Acknowledge other) {
                    if (other == Sitewhere.SiteWhere.Acknowledge.getDefaultInstance()) return this;
                    if (other.hasHardwareId()) {
                        bitField0_ |= 0x00000001;
                        hardwareId_ = other.hardwareId_;
                        onChanged();
                    }
                    if (other.hasMessage()) {
                        bitField0_ |= 0x00000002;
                        message_ = other.message_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasHardwareId()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.SiteWhere.Acknowledge parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.SiteWhere.Acknowledge) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string hardwareId = 1;
                private java.lang.Object hardwareId_ = "";
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public boolean hasHardwareId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public java.lang.String getHardwareId() {
                    java.lang.Object ref = hardwareId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        hardwareId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getHardwareIdBytes() {
                    java.lang.Object ref = hardwareId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        hardwareId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder clearHardwareId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    hardwareId_ = getDefaultInstance().getHardwareId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }

                // optional string message = 2;
                private java.lang.Object message_ = "";
                /**
                 * <code>optional string message = 2;</code>
                 */
                public boolean hasMessage() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>optional string message = 2;</code>
                 */
                public java.lang.String getMessage() {
                    java.lang.Object ref = message_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        message_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>optional string message = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getMessageBytes() {
                    java.lang.Object ref = message_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        message_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>optional string message = 2;</code>
                 */
                public Builder setMessage(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    message_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string message = 2;</code>
                 */
                public Builder clearMessage() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    message_ = getDefaultInstance().getMessage();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string message = 2;</code>
                 */
                public Builder setMessageBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    message_ = value;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:SiteWhere.Acknowledge)
            }

            static {
                defaultInstance = new Acknowledge(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:SiteWhere.Acknowledge)
        }

        public interface DeviceStreamDataRequestOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string hardwareId = 1;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            boolean hasHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            java.lang.String getHardwareId();
            /**
             * <code>required string hardwareId = 1;</code>
             */
            com.google.protobuf.ByteString
            getHardwareIdBytes();

            // required string streamId = 2;
            /**
             * <code>required string streamId = 2;</code>
             */
            boolean hasStreamId();
            /**
             * <code>required string streamId = 2;</code>
             */
            java.lang.String getStreamId();
            /**
             * <code>required string streamId = 2;</code>
             */
            com.google.protobuf.ByteString
            getStreamIdBytes();

            // required fixed64 sequenceNumber = 3;
            /**
             * <code>required fixed64 sequenceNumber = 3;</code>
             */
            boolean hasSequenceNumber();
            /**
             * <code>required fixed64 sequenceNumber = 3;</code>
             */
            long getSequenceNumber();
        }
        /**
         * Protobuf type {@code SiteWhere.DeviceStreamDataRequest}
         *
         * <pre>
         * Request for a chunk of data from a device stream.
         * </pre>
         */
        public static final class DeviceStreamDataRequest extends
                com.google.protobuf.GeneratedMessage
                implements DeviceStreamDataRequestOrBuilder {
            // Use DeviceStreamDataRequest.newBuilder() to construct.
            private DeviceStreamDataRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private DeviceStreamDataRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final DeviceStreamDataRequest defaultInstance;
            public static DeviceStreamDataRequest getDefaultInstance() {
                return defaultInstance;
            }

            public DeviceStreamDataRequest getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private DeviceStreamDataRequest(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                hardwareId_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                streamId_ = input.readBytes();
                                break;
                            }
                            case 25: {
                                bitField0_ |= 0x00000004;
                                sequenceNumber_ = input.readFixed64();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_SiteWhere_DeviceStreamDataRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_SiteWhere_DeviceStreamDataRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.SiteWhere.DeviceStreamDataRequest.class, Sitewhere.SiteWhere.DeviceStreamDataRequest.Builder.class);
            }

            public static com.google.protobuf.Parser<DeviceStreamDataRequest> PARSER =
                    new com.google.protobuf.AbstractParser<DeviceStreamDataRequest>() {
                        public DeviceStreamDataRequest parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new DeviceStreamDataRequest(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<DeviceStreamDataRequest> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string hardwareId = 1;
            public static final int HARDWAREID_FIELD_NUMBER = 1;
            private java.lang.Object hardwareId_;
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public boolean hasHardwareId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public java.lang.String getHardwareId() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        hardwareId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string hardwareId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getHardwareIdBytes() {
                java.lang.Object ref = hardwareId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hardwareId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required string streamId = 2;
            public static final int STREAMID_FIELD_NUMBER = 2;
            private java.lang.Object streamId_;
            /**
             * <code>required string streamId = 2;</code>
             */
            public boolean hasStreamId() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string streamId = 2;</code>
             */
            public java.lang.String getStreamId() {
                java.lang.Object ref = streamId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        streamId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string streamId = 2;</code>
             */
            public com.google.protobuf.ByteString
            getStreamIdBytes() {
                java.lang.Object ref = streamId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    streamId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required fixed64 sequenceNumber = 3;
            public static final int SEQUENCENUMBER_FIELD_NUMBER = 3;
            private long sequenceNumber_;
            /**
             * <code>required fixed64 sequenceNumber = 3;</code>
             */
            public boolean hasSequenceNumber() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required fixed64 sequenceNumber = 3;</code>
             */
            public long getSequenceNumber() {
                return sequenceNumber_;
            }

            private void initFields() {
                hardwareId_ = "";
                streamId_ = "";
                sequenceNumber_ = 0L;
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasHardwareId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasStreamId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasSequenceNumber()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getStreamIdBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeFixed64(3, sequenceNumber_);
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getHardwareIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getStreamIdBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeFixed64Size(3, sequenceNumber_);
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.SiteWhere.DeviceStreamDataRequest parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.SiteWhere.DeviceStreamDataRequest prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code SiteWhere.DeviceStreamDataRequest}
             *
             * <pre>
             * Request for a chunk of data from a device stream.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.SiteWhere.DeviceStreamDataRequestOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_SiteWhere_DeviceStreamDataRequest_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_SiteWhere_DeviceStreamDataRequest_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.SiteWhere.DeviceStreamDataRequest.class, Sitewhere.SiteWhere.DeviceStreamDataRequest.Builder.class);
                }

                // Construct using Sitewhere.SiteWhere.DeviceStreamDataRequest.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    hardwareId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    streamId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    sequenceNumber_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000004);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_SiteWhere_DeviceStreamDataRequest_descriptor;
                }

                public Sitewhere.SiteWhere.DeviceStreamDataRequest getDefaultInstanceForType() {
                    return Sitewhere.SiteWhere.DeviceStreamDataRequest.getDefaultInstance();
                }

                public Sitewhere.SiteWhere.DeviceStreamDataRequest build() {
                    Sitewhere.SiteWhere.DeviceStreamDataRequest result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.SiteWhere.DeviceStreamDataRequest buildPartial() {
                    Sitewhere.SiteWhere.DeviceStreamDataRequest result = new Sitewhere.SiteWhere.DeviceStreamDataRequest(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.hardwareId_ = hardwareId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.streamId_ = streamId_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.sequenceNumber_ = sequenceNumber_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.SiteWhere.DeviceStreamDataRequest) {
                        return mergeFrom((Sitewhere.SiteWhere.DeviceStreamDataRequest)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.SiteWhere.DeviceStreamDataRequest other) {
                    if (other == Sitewhere.SiteWhere.DeviceStreamDataRequest.getDefaultInstance()) return this;
                    if (other.hasHardwareId()) {
                        bitField0_ |= 0x00000001;
                        hardwareId_ = other.hardwareId_;
                        onChanged();
                    }
                    if (other.hasStreamId()) {
                        bitField0_ |= 0x00000002;
                        streamId_ = other.streamId_;
                        onChanged();
                    }
                    if (other.hasSequenceNumber()) {
                        setSequenceNumber(other.getSequenceNumber());
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasHardwareId()) {

                        return false;
                    }
                    if (!hasStreamId()) {

                        return false;
                    }
                    if (!hasSequenceNumber()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.SiteWhere.DeviceStreamDataRequest parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.SiteWhere.DeviceStreamDataRequest) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string hardwareId = 1;
                private java.lang.Object hardwareId_ = "";
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public boolean hasHardwareId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public java.lang.String getHardwareId() {
                    java.lang.Object ref = hardwareId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        hardwareId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getHardwareIdBytes() {
                    java.lang.Object ref = hardwareId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        hardwareId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder clearHardwareId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    hardwareId_ = getDefaultInstance().getHardwareId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string hardwareId = 1;</code>
                 */
                public Builder setHardwareIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    hardwareId_ = value;
                    onChanged();
                    return this;
                }

                // required string streamId = 2;
                private java.lang.Object streamId_ = "";
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public boolean hasStreamId() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public java.lang.String getStreamId() {
                    java.lang.Object ref = streamId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        streamId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getStreamIdBytes() {
                    java.lang.Object ref = streamId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        streamId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder setStreamId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    streamId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder clearStreamId() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    streamId_ = getDefaultInstance().getStreamId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string streamId = 2;</code>
                 */
                public Builder setStreamIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    streamId_ = value;
                    onChanged();
                    return this;
                }

                // required fixed64 sequenceNumber = 3;
                private long sequenceNumber_ ;
                /**
                 * <code>required fixed64 sequenceNumber = 3;</code>
                 */
                public boolean hasSequenceNumber() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>required fixed64 sequenceNumber = 3;</code>
                 */
                public long getSequenceNumber() {
                    return sequenceNumber_;
                }
                /**
                 * <code>required fixed64 sequenceNumber = 3;</code>
                 */
                public Builder setSequenceNumber(long value) {
                    bitField0_ |= 0x00000004;
                    sequenceNumber_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required fixed64 sequenceNumber = 3;</code>
                 */
                public Builder clearSequenceNumber() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    sequenceNumber_ = 0L;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:SiteWhere.DeviceStreamDataRequest)
            }

            static {
                defaultInstance = new DeviceStreamDataRequest(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:SiteWhere.DeviceStreamDataRequest)
        }

        private void initFields() {
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Sitewhere.SiteWhere parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Sitewhere.SiteWhere parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Sitewhere.SiteWhere parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Sitewhere.SiteWhere parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Sitewhere.SiteWhere parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Sitewhere.SiteWhere parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Sitewhere.SiteWhere parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Sitewhere.SiteWhere parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Sitewhere.SiteWhere parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Sitewhere.SiteWhere parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Sitewhere.SiteWhere prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code SiteWhere}
         *
         * <pre>
         * Commands sent from a device to SiteWhere.
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Sitewhere.SiteWhereOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_SiteWhere_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_SiteWhere_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.SiteWhere.class, Sitewhere.SiteWhere.Builder.class);
            }

            // Construct using Sitewhere.SiteWhere.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Sitewhere.internal_static_SiteWhere_descriptor;
            }

            public Sitewhere.SiteWhere getDefaultInstanceForType() {
                return Sitewhere.SiteWhere.getDefaultInstance();
            }

            public Sitewhere.SiteWhere build() {
                Sitewhere.SiteWhere result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Sitewhere.SiteWhere buildPartial() {
                Sitewhere.SiteWhere result = new Sitewhere.SiteWhere(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Sitewhere.SiteWhere) {
                    return mergeFrom((Sitewhere.SiteWhere)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Sitewhere.SiteWhere other) {
                if (other == Sitewhere.SiteWhere.getDefaultInstance()) return this;
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Sitewhere.SiteWhere parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Sitewhere.SiteWhere) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            // @@protoc_insertion_point(builder_scope:SiteWhere)
        }

        static {
            defaultInstance = new SiteWhere(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:SiteWhere)
    }

    public interface DeviceOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code Device}
     *
     * <pre>
     * Commands sent from SiteWhere to a device.
     * </pre>
     */
    public static final class Device extends
            com.google.protobuf.GeneratedMessage
            implements DeviceOrBuilder {
        // Use Device.newBuilder() to construct.
        private Device(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Device(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Device defaultInstance;
        public static Device getDefaultInstance() {
            return defaultInstance;
        }

        public Device getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Device(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Sitewhere.internal_static_Device_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Sitewhere.internal_static_Device_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Sitewhere.Device.class, Sitewhere.Device.Builder.class);
        }

        public static com.google.protobuf.Parser<Device> PARSER =
                new com.google.protobuf.AbstractParser<Device>() {
                    public Device parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Device(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<Device> getParserForType() {
            return PARSER;
        }

        /**
         * Protobuf enum {@code Device.Command}
         */
        public enum Command
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>ACK_REGISTRATION = 1;</code>
             */
            ACK_REGISTRATION(0, 1),
            /**
             * <code>ACK_DEVICE_STREAM = 2;</code>
             */
            ACK_DEVICE_STREAM(1, 2),
            /**
             * <code>RECEIVE_DEVICE_STREAM_DATA = 3;</code>
             */
            RECEIVE_DEVICE_STREAM_DATA(2, 3),
            ;

            /**
             * <code>ACK_REGISTRATION = 1;</code>
             */
            public static final int ACK_REGISTRATION_VALUE = 1;
            /**
             * <code>ACK_DEVICE_STREAM = 2;</code>
             */
            public static final int ACK_DEVICE_STREAM_VALUE = 2;
            /**
             * <code>RECEIVE_DEVICE_STREAM_DATA = 3;</code>
             */
            public static final int RECEIVE_DEVICE_STREAM_DATA_VALUE = 3;


            public final int getNumber() { return value; }

            public static Command valueOf(int value) {
                switch (value) {
                    case 1: return ACK_REGISTRATION;
                    case 2: return ACK_DEVICE_STREAM;
                    case 3: return RECEIVE_DEVICE_STREAM_DATA;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Command>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<Command>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Command>() {
                        public Command findValueByNumber(int number) {
                            return Command.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Sitewhere.Device.getDescriptor().getEnumTypes().get(0);
            }

            private static final Command[] VALUES = values();

            public static Command valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private Command(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:Device.Command)
        }

        /**
         * Protobuf enum {@code Device.RegistrationAckState}
         *
         * <pre>
         * Enumeration of registation state responses.
         * </pre>
         */
        public enum RegistrationAckState
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>NEW_REGISTRATION = 1;</code>
             */
            NEW_REGISTRATION(0, 1),
            /**
             * <code>ALREADY_REGISTERED = 2;</code>
             */
            ALREADY_REGISTERED(1, 2),
            /**
             * <code>REGISTRATION_ERROR = 3;</code>
             */
            REGISTRATION_ERROR(2, 3),
            ;

            /**
             * <code>NEW_REGISTRATION = 1;</code>
             */
            public static final int NEW_REGISTRATION_VALUE = 1;
            /**
             * <code>ALREADY_REGISTERED = 2;</code>
             */
            public static final int ALREADY_REGISTERED_VALUE = 2;
            /**
             * <code>REGISTRATION_ERROR = 3;</code>
             */
            public static final int REGISTRATION_ERROR_VALUE = 3;


            public final int getNumber() { return value; }

            public static RegistrationAckState valueOf(int value) {
                switch (value) {
                    case 1: return NEW_REGISTRATION;
                    case 2: return ALREADY_REGISTERED;
                    case 3: return REGISTRATION_ERROR;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<RegistrationAckState>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<RegistrationAckState>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<RegistrationAckState>() {
                        public RegistrationAckState findValueByNumber(int number) {
                            return RegistrationAckState.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Sitewhere.Device.getDescriptor().getEnumTypes().get(1);
            }

            private static final RegistrationAckState[] VALUES = values();

            public static RegistrationAckState valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private RegistrationAckState(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:Device.RegistrationAckState)
        }

        /**
         * Protobuf enum {@code Device.RegistrationAckError}
         */
        public enum RegistrationAckError
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>INVALID_SPECIFICATION = 1;</code>
             */
            INVALID_SPECIFICATION(0, 1),
            /**
             * <code>SITE_TOKEN_REQUIRED = 2;</code>
             */
            SITE_TOKEN_REQUIRED(1, 2),
            /**
             * <code>NEW_DEVICES_NOT_ALLOWED = 3;</code>
             */
            NEW_DEVICES_NOT_ALLOWED(2, 3),
            ;

            /**
             * <code>INVALID_SPECIFICATION = 1;</code>
             */
            public static final int INVALID_SPECIFICATION_VALUE = 1;
            /**
             * <code>SITE_TOKEN_REQUIRED = 2;</code>
             */
            public static final int SITE_TOKEN_REQUIRED_VALUE = 2;
            /**
             * <code>NEW_DEVICES_NOT_ALLOWED = 3;</code>
             */
            public static final int NEW_DEVICES_NOT_ALLOWED_VALUE = 3;


            public final int getNumber() { return value; }

            public static RegistrationAckError valueOf(int value) {
                switch (value) {
                    case 1: return INVALID_SPECIFICATION;
                    case 2: return SITE_TOKEN_REQUIRED;
                    case 3: return NEW_DEVICES_NOT_ALLOWED;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<RegistrationAckError>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<RegistrationAckError>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<RegistrationAckError>() {
                        public RegistrationAckError findValueByNumber(int number) {
                            return RegistrationAckError.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Sitewhere.Device.getDescriptor().getEnumTypes().get(2);
            }

            private static final RegistrationAckError[] VALUES = values();

            public static RegistrationAckError valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private RegistrationAckError(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:Device.RegistrationAckError)
        }

        /**
         * Protobuf enum {@code Device.DeviceStreamAckState}
         *
         * <pre>
         * Enumeration of device stream creation responses.
         * </pre>
         */
        public enum DeviceStreamAckState
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>STREAM_CREATED = 1;</code>
             */
            STREAM_CREATED(0, 1),
            /**
             * <code>STREAM_EXISTS = 2;</code>
             */
            STREAM_EXISTS(1, 2),
            /**
             * <code>STREAM_FAILED = 3;</code>
             */
            STREAM_FAILED(2, 3),
            ;

            /**
             * <code>STREAM_CREATED = 1;</code>
             */
            public static final int STREAM_CREATED_VALUE = 1;
            /**
             * <code>STREAM_EXISTS = 2;</code>
             */
            public static final int STREAM_EXISTS_VALUE = 2;
            /**
             * <code>STREAM_FAILED = 3;</code>
             */
            public static final int STREAM_FAILED_VALUE = 3;


            public final int getNumber() { return value; }

            public static DeviceStreamAckState valueOf(int value) {
                switch (value) {
                    case 1: return STREAM_CREATED;
                    case 2: return STREAM_EXISTS;
                    case 3: return STREAM_FAILED;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<DeviceStreamAckState>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<DeviceStreamAckState>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<DeviceStreamAckState>() {
                        public DeviceStreamAckState findValueByNumber(int number) {
                            return DeviceStreamAckState.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Sitewhere.Device.getDescriptor().getEnumTypes().get(3);
            }

            private static final DeviceStreamAckState[] VALUES = values();

            public static DeviceStreamAckState valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private DeviceStreamAckState(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:Device.DeviceStreamAckState)
        }

        public interface HeaderOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required .Device.Command command = 1;
            /**
             * <code>required .Device.Command command = 1;</code>
             */
            boolean hasCommand();
            /**
             * <code>required .Device.Command command = 1;</code>
             */
            Sitewhere.Device.Command getCommand();

            // optional string originator = 2;
            /**
             * <code>optional string originator = 2;</code>
             */
            boolean hasOriginator();
            /**
             * <code>optional string originator = 2;</code>
             */
            java.lang.String getOriginator();
            /**
             * <code>optional string originator = 2;</code>
             */
            com.google.protobuf.ByteString
            getOriginatorBytes();

            // optional string nestedPath = 3;
            /**
             * <code>optional string nestedPath = 3;</code>
             */
            boolean hasNestedPath();
            /**
             * <code>optional string nestedPath = 3;</code>
             */
            java.lang.String getNestedPath();
            /**
             * <code>optional string nestedPath = 3;</code>
             */
            com.google.protobuf.ByteString
            getNestedPathBytes();

            // optional string nestedSpec = 4;
            /**
             * <code>optional string nestedSpec = 4;</code>
             */
            boolean hasNestedSpec();
            /**
             * <code>optional string nestedSpec = 4;</code>
             */
            java.lang.String getNestedSpec();
            /**
             * <code>optional string nestedSpec = 4;</code>
             */
            com.google.protobuf.ByteString
            getNestedSpecBytes();
        }
        /**
         * Protobuf type {@code Device.Header}
         *
         * <pre>
         * Header contains the command and originator.
         * </pre>
         */
        public static final class Header extends
                com.google.protobuf.GeneratedMessage
                implements HeaderOrBuilder {
            // Use Header.newBuilder() to construct.
            private Header(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private Header(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final Header defaultInstance;
            public static Header getDefaultInstance() {
                return defaultInstance;
            }

            public Header getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private Header(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 8: {
                                int rawValue = input.readEnum();
                                Sitewhere.Device.Command value = Sitewhere.Device.Command.valueOf(rawValue);
                                if (value == null) {
                                    unknownFields.mergeVarintField(1, rawValue);
                                } else {
                                    bitField0_ |= 0x00000001;
                                    command_ = value;
                                }
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                originator_ = input.readBytes();
                                break;
                            }
                            case 26: {
                                bitField0_ |= 0x00000004;
                                nestedPath_ = input.readBytes();
                                break;
                            }
                            case 34: {
                                bitField0_ |= 0x00000008;
                                nestedSpec_ = input.readBytes();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Device_Header_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Device_Header_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Device.Header.class, Sitewhere.Device.Header.Builder.class);
            }

            public static com.google.protobuf.Parser<Header> PARSER =
                    new com.google.protobuf.AbstractParser<Header>() {
                        public Header parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new Header(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<Header> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required .Device.Command command = 1;
            public static final int COMMAND_FIELD_NUMBER = 1;
            private Sitewhere.Device.Command command_;
            /**
             * <code>required .Device.Command command = 1;</code>
             */
            public boolean hasCommand() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required .Device.Command command = 1;</code>
             */
            public Sitewhere.Device.Command getCommand() {
                return command_;
            }

            // optional string originator = 2;
            public static final int ORIGINATOR_FIELD_NUMBER = 2;
            private java.lang.Object originator_;
            /**
             * <code>optional string originator = 2;</code>
             */
            public boolean hasOriginator() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string originator = 2;</code>
             */
            public java.lang.String getOriginator() {
                java.lang.Object ref = originator_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        originator_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>optional string originator = 2;</code>
             */
            public com.google.protobuf.ByteString
            getOriginatorBytes() {
                java.lang.Object ref = originator_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    originator_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // optional string nestedPath = 3;
            public static final int NESTEDPATH_FIELD_NUMBER = 3;
            private java.lang.Object nestedPath_;
            /**
             * <code>optional string nestedPath = 3;</code>
             */
            public boolean hasNestedPath() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional string nestedPath = 3;</code>
             */
            public java.lang.String getNestedPath() {
                java.lang.Object ref = nestedPath_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        nestedPath_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>optional string nestedPath = 3;</code>
             */
            public com.google.protobuf.ByteString
            getNestedPathBytes() {
                java.lang.Object ref = nestedPath_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    nestedPath_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // optional string nestedSpec = 4;
            public static final int NESTEDSPEC_FIELD_NUMBER = 4;
            private java.lang.Object nestedSpec_;
            /**
             * <code>optional string nestedSpec = 4;</code>
             */
            public boolean hasNestedSpec() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional string nestedSpec = 4;</code>
             */
            public java.lang.String getNestedSpec() {
                java.lang.Object ref = nestedSpec_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        nestedSpec_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>optional string nestedSpec = 4;</code>
             */
            public com.google.protobuf.ByteString
            getNestedSpecBytes() {
                java.lang.Object ref = nestedSpec_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    nestedSpec_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private void initFields() {
                command_ = Sitewhere.Device.Command.ACK_REGISTRATION;
                originator_ = "";
                nestedPath_ = "";
                nestedSpec_ = "";
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasCommand()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeEnum(1, command_.getNumber());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getOriginatorBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeBytes(3, getNestedPathBytes());
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    output.writeBytes(4, getNestedSpecBytes());
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(1, command_.getNumber());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getOriginatorBytes());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(3, getNestedPathBytes());
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(4, getNestedSpecBytes());
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Device.Header parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Device.Header parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Device.Header parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Device.Header parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Device.Header parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Device.Header parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Device.Header parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Device.Header parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Device.Header parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Device.Header parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Device.Header prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Device.Header}
             *
             * <pre>
             * Header contains the command and originator.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Device.HeaderOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Device_Header_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Device_Header_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Device.Header.class, Sitewhere.Device.Header.Builder.class);
                }

                // Construct using Sitewhere.Device.Header.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    command_ = Sitewhere.Device.Command.ACK_REGISTRATION;
                    bitField0_ = (bitField0_ & ~0x00000001);
                    originator_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    nestedPath_ = "";
                    bitField0_ = (bitField0_ & ~0x00000004);
                    nestedSpec_ = "";
                    bitField0_ = (bitField0_ & ~0x00000008);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Device_Header_descriptor;
                }

                public Sitewhere.Device.Header getDefaultInstanceForType() {
                    return Sitewhere.Device.Header.getDefaultInstance();
                }

                public Sitewhere.Device.Header build() {
                    Sitewhere.Device.Header result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Device.Header buildPartial() {
                    Sitewhere.Device.Header result = new Sitewhere.Device.Header(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.command_ = command_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.originator_ = originator_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.nestedPath_ = nestedPath_;
                    if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                        to_bitField0_ |= 0x00000008;
                    }
                    result.nestedSpec_ = nestedSpec_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Device.Header) {
                        return mergeFrom((Sitewhere.Device.Header)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Device.Header other) {
                    if (other == Sitewhere.Device.Header.getDefaultInstance()) return this;
                    if (other.hasCommand()) {
                        setCommand(other.getCommand());
                    }
                    if (other.hasOriginator()) {
                        bitField0_ |= 0x00000002;
                        originator_ = other.originator_;
                        onChanged();
                    }
                    if (other.hasNestedPath()) {
                        bitField0_ |= 0x00000004;
                        nestedPath_ = other.nestedPath_;
                        onChanged();
                    }
                    if (other.hasNestedSpec()) {
                        bitField0_ |= 0x00000008;
                        nestedSpec_ = other.nestedSpec_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasCommand()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Device.Header parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Device.Header) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required .Device.Command command = 1;
                private Sitewhere.Device.Command command_ = Sitewhere.Device.Command.ACK_REGISTRATION;
                /**
                 * <code>required .Device.Command command = 1;</code>
                 */
                public boolean hasCommand() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required .Device.Command command = 1;</code>
                 */
                public Sitewhere.Device.Command getCommand() {
                    return command_;
                }
                /**
                 * <code>required .Device.Command command = 1;</code>
                 */
                public Builder setCommand(Sitewhere.Device.Command value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    command_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required .Device.Command command = 1;</code>
                 */
                public Builder clearCommand() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    command_ = Sitewhere.Device.Command.ACK_REGISTRATION;
                    onChanged();
                    return this;
                }

                // optional string originator = 2;
                private java.lang.Object originator_ = "";
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public boolean hasOriginator() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public java.lang.String getOriginator() {
                    java.lang.Object ref = originator_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        originator_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public com.google.protobuf.ByteString
                getOriginatorBytes() {
                    java.lang.Object ref = originator_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        originator_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public Builder setOriginator(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    originator_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public Builder clearOriginator() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    originator_ = getDefaultInstance().getOriginator();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string originator = 2;</code>
                 */
                public Builder setOriginatorBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    originator_ = value;
                    onChanged();
                    return this;
                }

                // optional string nestedPath = 3;
                private java.lang.Object nestedPath_ = "";
                /**
                 * <code>optional string nestedPath = 3;</code>
                 */
                public boolean hasNestedPath() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>optional string nestedPath = 3;</code>
                 */
                public java.lang.String getNestedPath() {
                    java.lang.Object ref = nestedPath_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        nestedPath_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>optional string nestedPath = 3;</code>
                 */
                public com.google.protobuf.ByteString
                getNestedPathBytes() {
                    java.lang.Object ref = nestedPath_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        nestedPath_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>optional string nestedPath = 3;</code>
                 */
                public Builder setNestedPath(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000004;
                    nestedPath_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string nestedPath = 3;</code>
                 */
                public Builder clearNestedPath() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    nestedPath_ = getDefaultInstance().getNestedPath();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string nestedPath = 3;</code>
                 */
                public Builder setNestedPathBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000004;
                    nestedPath_ = value;
                    onChanged();
                    return this;
                }

                // optional string nestedSpec = 4;
                private java.lang.Object nestedSpec_ = "";
                /**
                 * <code>optional string nestedSpec = 4;</code>
                 */
                public boolean hasNestedSpec() {
                    return ((bitField0_ & 0x00000008) == 0x00000008);
                }
                /**
                 * <code>optional string nestedSpec = 4;</code>
                 */
                public java.lang.String getNestedSpec() {
                    java.lang.Object ref = nestedSpec_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        nestedSpec_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>optional string nestedSpec = 4;</code>
                 */
                public com.google.protobuf.ByteString
                getNestedSpecBytes() {
                    java.lang.Object ref = nestedSpec_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        nestedSpec_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>optional string nestedSpec = 4;</code>
                 */
                public Builder setNestedSpec(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000008;
                    nestedSpec_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string nestedSpec = 4;</code>
                 */
                public Builder clearNestedSpec() {
                    bitField0_ = (bitField0_ & ~0x00000008);
                    nestedSpec_ = getDefaultInstance().getNestedSpec();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string nestedSpec = 4;</code>
                 */
                public Builder setNestedSpecBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000008;
                    nestedSpec_ = value;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:Device.Header)
            }

            static {
                defaultInstance = new Header(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Device.Header)
        }

        public interface RegistrationAckOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required .Device.RegistrationAckState state = 1;
            /**
             * <code>required .Device.RegistrationAckState state = 1;</code>
             */
            boolean hasState();
            /**
             * <code>required .Device.RegistrationAckState state = 1;</code>
             */
            Sitewhere.Device.RegistrationAckState getState();

            // optional .Device.RegistrationAckError errorType = 2;
            /**
             * <code>optional .Device.RegistrationAckError errorType = 2;</code>
             */
            boolean hasErrorType();
            /**
             * <code>optional .Device.RegistrationAckError errorType = 2;</code>
             */
            Sitewhere.Device.RegistrationAckError getErrorType();

            // optional string errorMessage = 3;
            /**
             * <code>optional string errorMessage = 3;</code>
             */
            boolean hasErrorMessage();
            /**
             * <code>optional string errorMessage = 3;</code>
             */
            java.lang.String getErrorMessage();
            /**
             * <code>optional string errorMessage = 3;</code>
             */
            com.google.protobuf.ByteString
            getErrorMessageBytes();
        }
        /**
         * Protobuf type {@code Device.RegistrationAck}
         *
         * <pre>
         * Acknowledges registration.
         * </pre>
         */
        public static final class RegistrationAck extends
                com.google.protobuf.GeneratedMessage
                implements RegistrationAckOrBuilder {
            // Use RegistrationAck.newBuilder() to construct.
            private RegistrationAck(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private RegistrationAck(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final RegistrationAck defaultInstance;
            public static RegistrationAck getDefaultInstance() {
                return defaultInstance;
            }

            public RegistrationAck getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private RegistrationAck(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 8: {
                                int rawValue = input.readEnum();
                                Sitewhere.Device.RegistrationAckState value = Sitewhere.Device.RegistrationAckState.valueOf(rawValue);
                                if (value == null) {
                                    unknownFields.mergeVarintField(1, rawValue);
                                } else {
                                    bitField0_ |= 0x00000001;
                                    state_ = value;
                                }
                                break;
                            }
                            case 16: {
                                int rawValue = input.readEnum();
                                Sitewhere.Device.RegistrationAckError value = Sitewhere.Device.RegistrationAckError.valueOf(rawValue);
                                if (value == null) {
                                    unknownFields.mergeVarintField(2, rawValue);
                                } else {
                                    bitField0_ |= 0x00000002;
                                    errorType_ = value;
                                }
                                break;
                            }
                            case 26: {
                                bitField0_ |= 0x00000004;
                                errorMessage_ = input.readBytes();
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Device_RegistrationAck_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Device_RegistrationAck_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Device.RegistrationAck.class, Sitewhere.Device.RegistrationAck.Builder.class);
            }

            public static com.google.protobuf.Parser<RegistrationAck> PARSER =
                    new com.google.protobuf.AbstractParser<RegistrationAck>() {
                        public RegistrationAck parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new RegistrationAck(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<RegistrationAck> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required .Device.RegistrationAckState state = 1;
            public static final int STATE_FIELD_NUMBER = 1;
            private Sitewhere.Device.RegistrationAckState state_;
            /**
             * <code>required .Device.RegistrationAckState state = 1;</code>
             */
            public boolean hasState() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required .Device.RegistrationAckState state = 1;</code>
             */
            public Sitewhere.Device.RegistrationAckState getState() {
                return state_;
            }

            // optional .Device.RegistrationAckError errorType = 2;
            public static final int ERRORTYPE_FIELD_NUMBER = 2;
            private Sitewhere.Device.RegistrationAckError errorType_;
            /**
             * <code>optional .Device.RegistrationAckError errorType = 2;</code>
             */
            public boolean hasErrorType() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional .Device.RegistrationAckError errorType = 2;</code>
             */
            public Sitewhere.Device.RegistrationAckError getErrorType() {
                return errorType_;
            }

            // optional string errorMessage = 3;
            public static final int ERRORMESSAGE_FIELD_NUMBER = 3;
            private java.lang.Object errorMessage_;
            /**
             * <code>optional string errorMessage = 3;</code>
             */
            public boolean hasErrorMessage() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional string errorMessage = 3;</code>
             */
            public java.lang.String getErrorMessage() {
                java.lang.Object ref = errorMessage_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        errorMessage_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>optional string errorMessage = 3;</code>
             */
            public com.google.protobuf.ByteString
            getErrorMessageBytes() {
                java.lang.Object ref = errorMessage_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    errorMessage_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private void initFields() {
                state_ = Sitewhere.Device.RegistrationAckState.NEW_REGISTRATION;
                errorType_ = Sitewhere.Device.RegistrationAckError.INVALID_SPECIFICATION;
                errorMessage_ = "";
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasState()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeEnum(1, state_.getNumber());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeEnum(2, errorType_.getNumber());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeBytes(3, getErrorMessageBytes());
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(1, state_.getNumber());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(2, errorType_.getNumber());
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(3, getErrorMessageBytes());
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Device.RegistrationAck parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Device.RegistrationAck parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Device.RegistrationAck parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Device.RegistrationAck parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Device.RegistrationAck parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Device.RegistrationAck parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Device.RegistrationAck parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Device.RegistrationAck parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Device.RegistrationAck parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Device.RegistrationAck parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Device.RegistrationAck prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Device.RegistrationAck}
             *
             * <pre>
             * Acknowledges registration.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Device.RegistrationAckOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Device_RegistrationAck_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Device_RegistrationAck_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Device.RegistrationAck.class, Sitewhere.Device.RegistrationAck.Builder.class);
                }

                // Construct using Sitewhere.Device.RegistrationAck.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    state_ = Sitewhere.Device.RegistrationAckState.NEW_REGISTRATION;
                    bitField0_ = (bitField0_ & ~0x00000001);
                    errorType_ = Sitewhere.Device.RegistrationAckError.INVALID_SPECIFICATION;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    errorMessage_ = "";
                    bitField0_ = (bitField0_ & ~0x00000004);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Device_RegistrationAck_descriptor;
                }

                public Sitewhere.Device.RegistrationAck getDefaultInstanceForType() {
                    return Sitewhere.Device.RegistrationAck.getDefaultInstance();
                }

                public Sitewhere.Device.RegistrationAck build() {
                    Sitewhere.Device.RegistrationAck result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Device.RegistrationAck buildPartial() {
                    Sitewhere.Device.RegistrationAck result = new Sitewhere.Device.RegistrationAck(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.state_ = state_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.errorType_ = errorType_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.errorMessage_ = errorMessage_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Device.RegistrationAck) {
                        return mergeFrom((Sitewhere.Device.RegistrationAck)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Device.RegistrationAck other) {
                    if (other == Sitewhere.Device.RegistrationAck.getDefaultInstance()) return this;
                    if (other.hasState()) {
                        setState(other.getState());
                    }
                    if (other.hasErrorType()) {
                        setErrorType(other.getErrorType());
                    }
                    if (other.hasErrorMessage()) {
                        bitField0_ |= 0x00000004;
                        errorMessage_ = other.errorMessage_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasState()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Device.RegistrationAck parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Device.RegistrationAck) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required .Device.RegistrationAckState state = 1;
                private Sitewhere.Device.RegistrationAckState state_ = Sitewhere.Device.RegistrationAckState.NEW_REGISTRATION;
                /**
                 * <code>required .Device.RegistrationAckState state = 1;</code>
                 */
                public boolean hasState() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required .Device.RegistrationAckState state = 1;</code>
                 */
                public Sitewhere.Device.RegistrationAckState getState() {
                    return state_;
                }
                /**
                 * <code>required .Device.RegistrationAckState state = 1;</code>
                 */
                public Builder setState(Sitewhere.Device.RegistrationAckState value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    state_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required .Device.RegistrationAckState state = 1;</code>
                 */
                public Builder clearState() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    state_ = Sitewhere.Device.RegistrationAckState.NEW_REGISTRATION;
                    onChanged();
                    return this;
                }

                // optional .Device.RegistrationAckError errorType = 2;
                private Sitewhere.Device.RegistrationAckError errorType_ = Sitewhere.Device.RegistrationAckError.INVALID_SPECIFICATION;
                /**
                 * <code>optional .Device.RegistrationAckError errorType = 2;</code>
                 */
                public boolean hasErrorType() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>optional .Device.RegistrationAckError errorType = 2;</code>
                 */
                public Sitewhere.Device.RegistrationAckError getErrorType() {
                    return errorType_;
                }
                /**
                 * <code>optional .Device.RegistrationAckError errorType = 2;</code>
                 */
                public Builder setErrorType(Sitewhere.Device.RegistrationAckError value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    errorType_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional .Device.RegistrationAckError errorType = 2;</code>
                 */
                public Builder clearErrorType() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    errorType_ = Sitewhere.Device.RegistrationAckError.INVALID_SPECIFICATION;
                    onChanged();
                    return this;
                }

                // optional string errorMessage = 3;
                private java.lang.Object errorMessage_ = "";
                /**
                 * <code>optional string errorMessage = 3;</code>
                 */
                public boolean hasErrorMessage() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>optional string errorMessage = 3;</code>
                 */
                public java.lang.String getErrorMessage() {
                    java.lang.Object ref = errorMessage_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        errorMessage_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>optional string errorMessage = 3;</code>
                 */
                public com.google.protobuf.ByteString
                getErrorMessageBytes() {
                    java.lang.Object ref = errorMessage_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        errorMessage_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>optional string errorMessage = 3;</code>
                 */
                public Builder setErrorMessage(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000004;
                    errorMessage_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string errorMessage = 3;</code>
                 */
                public Builder clearErrorMessage() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    errorMessage_ = getDefaultInstance().getErrorMessage();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string errorMessage = 3;</code>
                 */
                public Builder setErrorMessageBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000004;
                    errorMessage_ = value;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:Device.RegistrationAck)
            }

            static {
                defaultInstance = new RegistrationAck(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Device.RegistrationAck)
        }

        public interface DeviceStreamAckOrBuilder
                extends com.google.protobuf.MessageOrBuilder {

            // required string streamId = 1;
            /**
             * <code>required string streamId = 1;</code>
             */
            boolean hasStreamId();
            /**
             * <code>required string streamId = 1;</code>
             */
            java.lang.String getStreamId();
            /**
             * <code>required string streamId = 1;</code>
             */
            com.google.protobuf.ByteString
            getStreamIdBytes();

            // required .Device.DeviceStreamAckState state = 2;
            /**
             * <code>required .Device.DeviceStreamAckState state = 2;</code>
             */
            boolean hasState();
            /**
             * <code>required .Device.DeviceStreamAckState state = 2;</code>
             */
            Sitewhere.Device.DeviceStreamAckState getState();
        }
        /**
         * Protobuf type {@code Device.DeviceStreamAck}
         *
         * <pre>
         * Acknowledges creation of device stream.
         * </pre>
         */
        public static final class DeviceStreamAck extends
                com.google.protobuf.GeneratedMessage
                implements DeviceStreamAckOrBuilder {
            // Use DeviceStreamAck.newBuilder() to construct.
            private DeviceStreamAck(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private DeviceStreamAck(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

            private static final DeviceStreamAck defaultInstance;
            public static DeviceStreamAck getDefaultInstance() {
                return defaultInstance;
            }

            public DeviceStreamAck getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private DeviceStreamAck(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                bitField0_ |= 0x00000001;
                                streamId_ = input.readBytes();
                                break;
                            }
                            case 16: {
                                int rawValue = input.readEnum();
                                Sitewhere.Device.DeviceStreamAckState value = Sitewhere.Device.DeviceStreamAckState.valueOf(rawValue);
                                if (value == null) {
                                    unknownFields.mergeVarintField(2, rawValue);
                                } else {
                                    bitField0_ |= 0x00000002;
                                    state_ = value;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Device_DeviceStreamAck_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Device_DeviceStreamAck_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Device.DeviceStreamAck.class, Sitewhere.Device.DeviceStreamAck.Builder.class);
            }

            public static com.google.protobuf.Parser<DeviceStreamAck> PARSER =
                    new com.google.protobuf.AbstractParser<DeviceStreamAck>() {
                        public DeviceStreamAck parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new DeviceStreamAck(input, extensionRegistry);
                        }
                    };

            @java.lang.Override
            public com.google.protobuf.Parser<DeviceStreamAck> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required string streamId = 1;
            public static final int STREAMID_FIELD_NUMBER = 1;
            private java.lang.Object streamId_;
            /**
             * <code>required string streamId = 1;</code>
             */
            public boolean hasStreamId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string streamId = 1;</code>
             */
            public java.lang.String getStreamId() {
                java.lang.Object ref = streamId_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        streamId_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>required string streamId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getStreamIdBytes() {
                java.lang.Object ref = streamId_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    streamId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            // required .Device.DeviceStreamAckState state = 2;
            public static final int STATE_FIELD_NUMBER = 2;
            private Sitewhere.Device.DeviceStreamAckState state_;
            /**
             * <code>required .Device.DeviceStreamAckState state = 2;</code>
             */
            public boolean hasState() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required .Device.DeviceStreamAckState state = 2;</code>
             */
            public Sitewhere.Device.DeviceStreamAckState getState() {
                return state_;
            }

            private void initFields() {
                streamId_ = "";
                state_ = Sitewhere.Device.DeviceStreamAckState.STREAM_CREATED;
            }
            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1) return isInitialized == 1;

                if (!hasStreamId()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasState()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, getStreamIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeEnum(2, state_.getNumber());
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;
            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(1, getStreamIdBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeEnumSize(2, state_.getNumber());
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            protected java.lang.Object writeReplace()
                    throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            public static Sitewhere.Device.DeviceStreamAck parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Device.DeviceStreamAck parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Device.DeviceStreamAck parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Sitewhere.Device.DeviceStreamAck parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Sitewhere.Device.DeviceStreamAck parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Device.DeviceStreamAck parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Sitewhere.Device.DeviceStreamAck parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static Sitewhere.Device.DeviceStreamAck parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static Sitewhere.Device.DeviceStreamAck parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static Sitewhere.Device.DeviceStreamAck parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(Sitewhere.Device.DeviceStreamAck prototype) {
                return newBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() { return newBuilder(this); }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code Device.DeviceStreamAck}
             *
             * <pre>
             * Acknowledges creation of device stream.
             * </pre>
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements Sitewhere.Device.DeviceStreamAckOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Sitewhere.internal_static_Device_DeviceStreamAck_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Sitewhere.internal_static_Device_DeviceStreamAck_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Sitewhere.Device.DeviceStreamAck.class, Sitewhere.Device.DeviceStreamAck.Builder.class);
                }

                // Construct using Sitewhere.Device.DeviceStreamAck.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }
                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    streamId_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    state_ = Sitewhere.Device.DeviceStreamAckState.STREAM_CREATED;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Sitewhere.internal_static_Device_DeviceStreamAck_descriptor;
                }

                public Sitewhere.Device.DeviceStreamAck getDefaultInstanceForType() {
                    return Sitewhere.Device.DeviceStreamAck.getDefaultInstance();
                }

                public Sitewhere.Device.DeviceStreamAck build() {
                    Sitewhere.Device.DeviceStreamAck result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public Sitewhere.Device.DeviceStreamAck buildPartial() {
                    Sitewhere.Device.DeviceStreamAck result = new Sitewhere.Device.DeviceStreamAck(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.streamId_ = streamId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.state_ = state_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Sitewhere.Device.DeviceStreamAck) {
                        return mergeFrom((Sitewhere.Device.DeviceStreamAck)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Sitewhere.Device.DeviceStreamAck other) {
                    if (other == Sitewhere.Device.DeviceStreamAck.getDefaultInstance()) return this;
                    if (other.hasStreamId()) {
                        bitField0_ |= 0x00000001;
                        streamId_ = other.streamId_;
                        onChanged();
                    }
                    if (other.hasState()) {
                        setState(other.getState());
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasStreamId()) {

                        return false;
                    }
                    if (!hasState()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Sitewhere.Device.DeviceStreamAck parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Sitewhere.Device.DeviceStreamAck) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                // required string streamId = 1;
                private java.lang.Object streamId_ = "";
                /**
                 * <code>required string streamId = 1;</code>
                 */
                public boolean hasStreamId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>required string streamId = 1;</code>
                 */
                public java.lang.String getStreamId() {
                    java.lang.Object ref = streamId_;
                    if (!(ref instanceof java.lang.String)) {
                        java.lang.String s = ((com.google.protobuf.ByteString) ref)
                                .toStringUtf8();
                        streamId_ = s;
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>required string streamId = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getStreamIdBytes() {
                    java.lang.Object ref = streamId_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        streamId_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>required string streamId = 1;</code>
                 */
                public Builder setStreamId(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    streamId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string streamId = 1;</code>
                 */
                public Builder clearStreamId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    streamId_ = getDefaultInstance().getStreamId();
                    onChanged();
                    return this;
                }
                /**
                 * <code>required string streamId = 1;</code>
                 */
                public Builder setStreamIdBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    streamId_ = value;
                    onChanged();
                    return this;
                }

                // required .Device.DeviceStreamAckState state = 2;
                private Sitewhere.Device.DeviceStreamAckState state_ = Sitewhere.Device.DeviceStreamAckState.STREAM_CREATED;
                /**
                 * <code>required .Device.DeviceStreamAckState state = 2;</code>
                 */
                public boolean hasState() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>required .Device.DeviceStreamAckState state = 2;</code>
                 */
                public Sitewhere.Device.DeviceStreamAckState getState() {
                    return state_;
                }
                /**
                 * <code>required .Device.DeviceStreamAckState state = 2;</code>
                 */
                public Builder setState(Sitewhere.Device.DeviceStreamAckState value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    state_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>required .Device.DeviceStreamAckState state = 2;</code>
                 */
                public Builder clearState() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    state_ = Sitewhere.Device.DeviceStreamAckState.STREAM_CREATED;
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:Device.DeviceStreamAck)
            }

            static {
                defaultInstance = new DeviceStreamAck(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:Device.DeviceStreamAck)
        }

        private void initFields() {
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Sitewhere.Device parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Sitewhere.Device parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Sitewhere.Device parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Sitewhere.Device parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Sitewhere.Device parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Sitewhere.Device parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Sitewhere.Device parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Sitewhere.Device parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Sitewhere.Device parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Sitewhere.Device parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Sitewhere.Device prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code Device}
         *
         * <pre>
         * Commands sent from SiteWhere to a device.
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Sitewhere.DeviceOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Sitewhere.internal_static_Device_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Sitewhere.internal_static_Device_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Sitewhere.Device.class, Sitewhere.Device.Builder.class);
            }

            // Construct using Sitewhere.Device.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Sitewhere.internal_static_Device_descriptor;
            }

            public Sitewhere.Device getDefaultInstanceForType() {
                return Sitewhere.Device.getDefaultInstance();
            }

            public Sitewhere.Device build() {
                Sitewhere.Device result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Sitewhere.Device buildPartial() {
                Sitewhere.Device result = new Sitewhere.Device(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Sitewhere.Device) {
                    return mergeFrom((Sitewhere.Device)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Sitewhere.Device other) {
                if (other == Sitewhere.Device.getDefaultInstance()) return this;
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Sitewhere.Device parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Sitewhere.Device) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Device)
        }

        static {
            defaultInstance = new Device(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:Device)
    }

    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_Metadata_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_Metadata_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_DeviceLocation_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_DeviceLocation_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_DeviceAlert_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_DeviceAlert_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_Measurement_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_Measurement_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_DeviceMeasurements_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_DeviceMeasurements_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_DeviceStream_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_DeviceStream_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Model_DeviceStreamData_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Model_DeviceStreamData_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_SiteWhere_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_SiteWhere_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_SiteWhere_Header_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_SiteWhere_Header_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_SiteWhere_RegisterDevice_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_SiteWhere_RegisterDevice_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_SiteWhere_Acknowledge_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_SiteWhere_Acknowledge_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_SiteWhere_DeviceStreamDataRequest_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_SiteWhere_DeviceStreamDataRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Device_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Device_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Device_Header_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Device_Header_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Device_RegistrationAck_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Device_RegistrationAck_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_Device_DeviceStreamAck_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Device_DeviceStreamAck_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\017sitewhere.proto\"\326\006\n\005Model\032\'\n\010Metadata\022" +
                        "\014\n\004name\030\001 \002(\t\022\r\n\005value\030\002 \002(\t\032\247\001\n\016DeviceL" +
                        "ocation\022\022\n\nhardwareId\030\001 \002(\t\022\020\n\010latitude\030" +
                        "\002 \002(\001\022\021\n\tlongitude\030\003 \002(\001\022\021\n\televation\030\004 " +
                        "\001(\001\022\021\n\teventDate\030\005 \001(\006\022!\n\010metadata\030\006 \003(\013" +
                        "2\017.Model.Metadata\022\023\n\013updateState\030\007 \001(\010\032\225" +
                        "\001\n\013DeviceAlert\022\022\n\nhardwareId\030\001 \002(\t\022\021\n\tal" +
                        "ertType\030\002 \002(\t\022\024\n\014alertMessage\030\003 \002(\t\022\021\n\te" +
                        "ventDate\030\004 \001(\006\022!\n\010metadata\030\005 \003(\0132\017.Model" +
                        ".Metadata\022\023\n\013updateState\030\006 \001(\010\032>\n\013Measur",
                "ement\022\025\n\rmeasurementId\030\001 \002(\t\022\030\n\020measurem" +
                        "entValue\030\002 \002(\001\032\234\001\n\022DeviceMeasurements\022\022\n" +
                        "\nhardwareId\030\001 \002(\t\022\'\n\013measurement\030\002 \003(\0132\022" +
                        ".Model.Measurement\022\021\n\teventDate\030\003 \001(\006\022!\n" +
                        "\010metadata\030\004 \003(\0132\017.Model.Metadata\022\023\n\013upda" +
                        "teState\030\005 \001(\010\032l\n\014DeviceStream\022\022\n\nhardwar" +
                        "eId\030\001 \002(\t\022\020\n\010streamId\030\002 \002(\t\022\023\n\013contentTy" +
                        "pe\030\003 \002(\t\022!\n\010metadata\030\004 \003(\0132\017.Model.Metad" +
                        "ata\032\224\001\n\020DeviceStreamData\022\022\n\nhardwareId\030\001" +
                        " \002(\t\022\020\n\010streamId\030\002 \002(\t\022\026\n\016sequenceNumber",
                "\030\003 \002(\006\022\014\n\004data\030\004 \002(\014\022\021\n\teventDate\030\005 \001(\006\022" +
                        "!\n\010metadata\030\006 \003(\0132\017.Model.Metadata\"\264\004\n\tS" +
                        "iteWhere\032A\n\006Header\022#\n\007command\030\001 \002(\0162\022.Si" +
                        "teWhere.Command\022\022\n\noriginator\030\002 \001(\t\032v\n\016R" +
                        "egisterDevice\022\022\n\nhardwareId\030\001 \002(\t\022\032\n\022spe" +
                        "cificationToken\030\002 \002(\t\022!\n\010metadata\030\003 \003(\0132" +
                        "\017.Model.Metadata\022\021\n\tsiteToken\030\004 \001(\t\0322\n\013A" +
                        "cknowledge\022\022\n\nhardwareId\030\001 \002(\t\022\017\n\007messag" +
                        "e\030\002 \001(\t\032W\n\027DeviceStreamDataRequest\022\022\n\nha" +
                        "rdwareId\030\001 \002(\t\022\020\n\010streamId\030\002 \002(\t\022\026\n\016sequ",
                "enceNumber\030\003 \002(\006\"\336\001\n\007Command\022\025\n\021SEND_REG" +
                        "ISTRATION\020\001\022\030\n\024SEND_ACKNOWLEDGEMENT\020\002\022\030\n" +
                        "\024SEND_DEVICE_LOCATION\020\003\022\025\n\021SEND_DEVICE_A" +
                        "LERT\020\004\022\034\n\030SEND_DEVICE_MEASUREMENTS\020\005\022\026\n\022" +
                        "SEND_DEVICE_STREAM\020\006\022\033\n\027SEND_DEVICE_STRE" +
                        "AM_DATA\020\007\022\036\n\032REQUEST_DEVICE_STREAM_DATA\020" +
                        "\010\"\273\005\n\006Device\032f\n\006Header\022 \n\007command\030\001 \002(\0162" +
                        "\017.Device.Command\022\022\n\noriginator\030\002 \001(\t\022\022\n\n" +
                        "nestedPath\030\003 \001(\t\022\022\n\nnestedSpec\030\004 \001(\t\032\205\001\n" +
                        "\017RegistrationAck\022+\n\005state\030\001 \002(\0162\034.Device",
                ".RegistrationAckState\022/\n\terrorType\030\002 \001(\016" +
                        "2\034.Device.RegistrationAckError\022\024\n\014errorM" +
                        "essage\030\003 \001(\t\032P\n\017DeviceStreamAck\022\020\n\010strea" +
                        "mId\030\001 \002(\t\022+\n\005state\030\002 \002(\0162\034.Device.Device" +
                        "StreamAckState\"V\n\007Command\022\024\n\020ACK_REGISTR" +
                        "ATION\020\001\022\025\n\021ACK_DEVICE_STREAM\020\002\022\036\n\032RECEIV" +
                        "E_DEVICE_STREAM_DATA\020\003\"\\\n\024RegistrationAc" +
                        "kState\022\024\n\020NEW_REGISTRATION\020\001\022\026\n\022ALREADY_" +
                        "REGISTERED\020\002\022\026\n\022REGISTRATION_ERROR\020\003\"g\n\024" +
                        "RegistrationAckError\022\031\n\025INVALID_SPECIFIC",
                "ATION\020\001\022\027\n\023SITE_TOKEN_REQUIRED\020\002\022\033\n\027NEW_" +
                        "DEVICES_NOT_ALLOWED\020\003\"P\n\024DeviceStreamAck" +
                        "State\022\022\n\016STREAM_CREATED\020\001\022\021\n\rSTREAM_EXIS" +
                        "TS\020\002\022\021\n\rSTREAM_FAILED\020\003"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_Model_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_Model_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Model_descriptor,
                                new java.lang.String[] { });
                        internal_static_Model_Metadata_descriptor =
                                internal_static_Model_descriptor.getNestedTypes().get(0);
                        internal_static_Model_Metadata_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Model_Metadata_descriptor,
                                new java.lang.String[] { "Name", "Value", });
                        internal_static_Model_DeviceLocation_descriptor =
                                internal_static_Model_descriptor.getNestedTypes().get(1);
                        internal_static_Model_DeviceLocation_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Model_DeviceLocation_descriptor,
                                new java.lang.String[] { "HardwareId", "Latitude", "Longitude", "Elevation", "EventDate", "Metadata", "UpdateState", });
                        internal_static_Model_DeviceAlert_descriptor =
                                internal_static_Model_descriptor.getNestedTypes().get(2);
                        internal_static_Model_DeviceAlert_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Model_DeviceAlert_descriptor,
                                new java.lang.String[] { "HardwareId", "AlertType", "AlertMessage", "EventDate", "Metadata", "UpdateState", });
                        internal_static_Model_Measurement_descriptor =
                                internal_static_Model_descriptor.getNestedTypes().get(3);
                        internal_static_Model_Measurement_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Model_Measurement_descriptor,
                                new java.lang.String[] { "MeasurementId", "MeasurementValue", });
                        internal_static_Model_DeviceMeasurements_descriptor =
                                internal_static_Model_descriptor.getNestedTypes().get(4);
                        internal_static_Model_DeviceMeasurements_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Model_DeviceMeasurements_descriptor,
                                new java.lang.String[] { "HardwareId", "Measurement", "EventDate", "Metadata", "UpdateState", });
                        internal_static_Model_DeviceStream_descriptor =
                                internal_static_Model_descriptor.getNestedTypes().get(5);
                        internal_static_Model_DeviceStream_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Model_DeviceStream_descriptor,
                                new java.lang.String[] { "HardwareId", "StreamId", "ContentType", "Metadata", });
                        internal_static_Model_DeviceStreamData_descriptor =
                                internal_static_Model_descriptor.getNestedTypes().get(6);
                        internal_static_Model_DeviceStreamData_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Model_DeviceStreamData_descriptor,
                                new java.lang.String[] { "HardwareId", "StreamId", "SequenceNumber", "Data", "EventDate", "Metadata", });
                        internal_static_SiteWhere_descriptor =
                                getDescriptor().getMessageTypes().get(1);
                        internal_static_SiteWhere_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_SiteWhere_descriptor,
                                new java.lang.String[] { });
                        internal_static_SiteWhere_Header_descriptor =
                                internal_static_SiteWhere_descriptor.getNestedTypes().get(0);
                        internal_static_SiteWhere_Header_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_SiteWhere_Header_descriptor,
                                new java.lang.String[] { "Command", "Originator", });
                        internal_static_SiteWhere_RegisterDevice_descriptor =
                                internal_static_SiteWhere_descriptor.getNestedTypes().get(1);
                        internal_static_SiteWhere_RegisterDevice_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_SiteWhere_RegisterDevice_descriptor,
                                new java.lang.String[] { "HardwareId", "SpecificationToken", "Metadata", "SiteToken", });
                        internal_static_SiteWhere_Acknowledge_descriptor =
                                internal_static_SiteWhere_descriptor.getNestedTypes().get(2);
                        internal_static_SiteWhere_Acknowledge_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_SiteWhere_Acknowledge_descriptor,
                                new java.lang.String[] { "HardwareId", "Message", });
                        internal_static_SiteWhere_DeviceStreamDataRequest_descriptor =
                                internal_static_SiteWhere_descriptor.getNestedTypes().get(3);
                        internal_static_SiteWhere_DeviceStreamDataRequest_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_SiteWhere_DeviceStreamDataRequest_descriptor,
                                new java.lang.String[] { "HardwareId", "StreamId", "SequenceNumber", });
                        internal_static_Device_descriptor =
                                getDescriptor().getMessageTypes().get(2);
                        internal_static_Device_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Device_descriptor,
                                new java.lang.String[] { });
                        internal_static_Device_Header_descriptor =
                                internal_static_Device_descriptor.getNestedTypes().get(0);
                        internal_static_Device_Header_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Device_Header_descriptor,
                                new java.lang.String[] { "Command", "Originator", "NestedPath", "NestedSpec", });
                        internal_static_Device_RegistrationAck_descriptor =
                                internal_static_Device_descriptor.getNestedTypes().get(1);
                        internal_static_Device_RegistrationAck_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Device_RegistrationAck_descriptor,
                                new java.lang.String[] { "State", "ErrorType", "ErrorMessage", });
                        internal_static_Device_DeviceStreamAck_descriptor =
                                internal_static_Device_descriptor.getNestedTypes().get(2);
                        internal_static_Device_DeviceStreamAck_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_Device_DeviceStreamAck_descriptor,
                                new java.lang.String[] { "StreamId", "State", });
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
