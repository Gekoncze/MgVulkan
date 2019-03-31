package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormatProperties.html">khronos documentation</a>
 **/
public class VkFormatProperties extends VkObject {
    public VkFormatProperties() {
        super(sizeof());
    }

    public VkFormatProperties(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkFormatProperties(VkFormatFeatureFlags linearTilingFeatures, VkFormatFeatureFlags optimalTilingFeatures, VkFormatFeatureFlags bufferFeatures) {
        super(sizeof());
        setLinearTilingFeatures(linearTilingFeatures);
        setOptimalTilingFeatures(optimalTilingFeatures);
        setBufferFeatures(bufferFeatures);
    }

    public VkFormatFeatureFlags getLinearTilingFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getLinearTilingFeatures(getVkAddress()));
    }

    public void setLinearTilingFeatures(VkFormatFeatureFlags linearTilingFeatures) {
        setLinearTilingFeatures(getVkAddress(), linearTilingFeatures.getVkAddress());
    }

    private static native long getLinearTilingFeatures(long address);
    private static native void setLinearTilingFeatures(long address, long linearTilingFeatures);

    public VkFormatFeatureFlags getOptimalTilingFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getOptimalTilingFeatures(getVkAddress()));
    }

    public void setOptimalTilingFeatures(VkFormatFeatureFlags optimalTilingFeatures) {
        setOptimalTilingFeatures(getVkAddress(), optimalTilingFeatures.getVkAddress());
    }

    private static native long getOptimalTilingFeatures(long address);
    private static native void setOptimalTilingFeatures(long address, long optimalTilingFeatures);

    public VkFormatFeatureFlags getBufferFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getBufferFeatures(getVkAddress()));
    }

    public void setBufferFeatures(VkFormatFeatureFlags bufferFeatures) {
        setBufferFeatures(getVkAddress(), bufferFeatures.getVkAddress());
    }

    private static native long getBufferFeatures(long address);
    private static native void setBufferFeatures(long address, long bufferFeatures);


    public static native long sizeof();

    public static class Array extends VkFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkFormatProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkFormatProperties get(int i){
            return new VkFormatProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkFormatProperties[] a) {
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
