package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorImageInfo.html">khronos documentation</a>
 **/
public class VkDescriptorImageInfo extends VkObject {
    public VkDescriptorImageInfo() {
        super(sizeof());
    }

    public VkDescriptorImageInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDescriptorImageInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDescriptorImageInfo(VkSampler sampler, VkImageView imageView, VkImageLayout imageLayout) {
        super(sizeof());
        setSampler(sampler);
        setImageView(imageView);
        setImageLayout(imageLayout);
    }

    public VkSampler getSampler() {
        return new VkSampler(getVkMemory(), getSampler(getVkAddress()));
    }

    public void setSampler(VkSampler sampler) {
        setSampler(getVkAddress(), sampler.getVkAddress());
    }

    private static native long getSampler(long address);
    private static native void setSampler(long address, long sampler);

    public VkImageView getImageView() {
        return new VkImageView(getVkMemory(), getImageView(getVkAddress()));
    }

    public void setImageView(VkImageView imageView) {
        setImageView(getVkAddress(), imageView.getVkAddress());
    }

    private static native long getImageView(long address);
    private static native void setImageView(long address, long imageView);

    public VkImageLayout getImageLayout() {
        return new VkImageLayout(getVkMemory(), getImageLayout(getVkAddress()));
    }

    public void setImageLayout(VkImageLayout imageLayout) {
        setImageLayout(getVkAddress(), imageLayout.getVkAddress());
    }

    private static native long getImageLayout(long address);
    private static native void setImageLayout(long address, long imageLayout);


    public static native long sizeof();

    public static class Array extends VkDescriptorImageInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorImageInfo> {
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
        public VkDescriptorImageInfo get(int i){
            return new VkDescriptorImageInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkDescriptorImageInfo[] a) {
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
