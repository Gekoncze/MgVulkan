package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkClearRect.html">khronos documentation</a>
 **/
public class VkClearRect extends VkObject {
    public VkClearRect() {
        super(sizeof());
    }

    public VkClearRect(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkClearRect(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkClearRect(VkRect2D rect, VkUInt32 baseArrayLayer, VkUInt32 layerCount) {
        super(sizeof());
        setRect(rect);
        setBaseArrayLayer(baseArrayLayer);
        setLayerCount(layerCount);
    }

    public VkRect2D getRect() {
        return new VkRect2D(getVkMemory(), getRect(getVkAddress()));
    }

    public void setRect(VkRect2D rect) {
        setRect(getVkAddress(), rect.getVkAddress());
    }

    private static native long getRect(long address);
    private static native void setRect(long address, long rect);

    public VkUInt32 getBaseArrayLayer() {
        return new VkUInt32(getVkMemory(), getBaseArrayLayer(getVkAddress()));
    }

    public void setBaseArrayLayer(VkUInt32 baseArrayLayer) {
        setBaseArrayLayer(getVkAddress(), baseArrayLayer.getVkAddress());
    }

    private static native long getBaseArrayLayer(long address);
    private static native void setBaseArrayLayer(long address, long baseArrayLayer);

    public VkUInt32 getLayerCount() {
        return new VkUInt32(getVkMemory(), getLayerCount(getVkAddress()));
    }

    public void setLayerCount(VkUInt32 layerCount) {
        setLayerCount(getVkAddress(), layerCount.getVkAddress());
    }

    private static native long getLayerCount(long address);
    private static native void setLayerCount(long address, long layerCount);


    public static native long sizeof();

    public static class Array extends VkClearRect implements cz.mg.collections.array.ReadonlyArray<VkClearRect> {
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
        public VkClearRect get(int i){
            return new VkClearRect(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkClearRect[] a) {
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
