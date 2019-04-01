package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormatFeatureFlagBits.html">khronos documentation</a>
 **/
public class VkFormatFeatureFlagBits extends VkFlagBits {
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 0x00000001;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 0x00000002;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 0x00000004;
    public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000008;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 0x00000010;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x00000020;
    public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 0x00000040;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 0x00000080;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 0x00000100;
    public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000200;
    public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 0x00000400;
    public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 0x00000800;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x00001000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT = 0x00004000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT = 0x00008000;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT = 0x00020000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 0x00040000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 0x00080000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 0x00100000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 0x00200000;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT = 0x00400000;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT = 0x00800000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG = 0x00002000;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT = 0x00010000;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR = VK_FORMAT_FEATURE_TRANSFER_SRC_BIT;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR = VK_FORMAT_FEATURE_TRANSFER_DST_BIT;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR = VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR = VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR = VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR = VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR = VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT_KHR = VK_FORMAT_FEATURE_DISJOINT_BIT;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR = VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT;

    public VkFormatFeatureFlagBits() {
    }

    public VkFormatFeatureFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFormatFeatureFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFormatFeatureFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT) s += "VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT) s += "VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT) s += "VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT) s += "VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT) s += "VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT) s += "VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT) s += "VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT) s += "VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT) s += "VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_BLIT_SRC_BIT) s += "VK_FORMAT_FEATURE_BLIT_SRC_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_BLIT_DST_BIT) s += "VK_FORMAT_FEATURE_BLIT_DST_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_TRANSFER_SRC_BIT) s += "VK_FORMAT_FEATURE_TRANSFER_SRC_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_TRANSFER_DST_BIT) s += "VK_FORMAT_FEATURE_TRANSFER_DST_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT) s += "VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_DISJOINT_BIT) s += "VK_FORMAT_FEATURE_DISJOINT_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT) s += "VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT ";
        if(getValue() == VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR) s += "VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR ";
        if(getValue() == VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR) s += "VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR ";
        if(getValue() == VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR) s += "VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR ";
        if(getValue() == VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR) s += "VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR ";
        if(getValue() == VK_FORMAT_FEATURE_DISJOINT_BIT_KHR) s += "VK_FORMAT_FEATURE_DISJOINT_BIT_KHR ";
        if(getValue() == VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR) s += "VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkFormatFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VkFormatFeatureFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFormatFeatureFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFormatFeatureFlagBits o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkFormatFeatureFlagBits get(int i){
            return new VkFormatFeatureFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkFormatFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkFormatFeatureFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
