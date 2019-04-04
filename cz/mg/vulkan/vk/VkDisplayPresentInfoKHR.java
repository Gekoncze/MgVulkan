package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPresentInfoKHR.html">khronos documentation</a>
 **/
public class VkDisplayPresentInfoKHR extends VkObject {
    public VkDisplayPresentInfoKHR() {
        super(sizeof());
    }

    public VkDisplayPresentInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPresentInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayPresentInfoKHR(VkObject pNext, VkRect2D srcRect, VkRect2D dstRect, VkBool32 persistent) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR));
        setPNext(pNext);
        setSrcRect(srcRect);
        setDstRect(dstRect);
        setPersistent(persistent);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkRect2D getSrcRect() {
        return new VkRect2D(getVkMemory(), getSrcRect(getVkAddress()));
    }

    
    public void setSrcRect(VkRect2D srcRect) {
        setSrcRect(getVkAddress(), srcRect != null ? srcRect.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSrcRect(long address);
    private static native void setSrcRect(long address, long srcRect);

    public VkRect2D getDstRect() {
        return new VkRect2D(getVkMemory(), getDstRect(getVkAddress()));
    }

    
    public void setDstRect(VkRect2D dstRect) {
        setDstRect(getVkAddress(), dstRect != null ? dstRect.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstRect(long address);
    private static native void setDstRect(long address, long dstRect);

    public VkBool32 getPersistent() {
        return new VkBool32(getVkMemory(), getPersistent(getVkAddress()));
    }

    
    public void setPersistent(VkBool32 persistent) {
        setPersistent(getVkAddress(), persistent != null ? persistent.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPersistent(long address);
    private static native void setPersistent(long address, long persistent);


    public static native long sizeof();

    public static class Array extends VkDisplayPresentInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPresentInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPresentInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayPresentInfoKHR o){
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
        public VkDisplayPresentInfoKHR get(int i){
            return new VkDisplayPresentInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayPresentInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayPresentInfoKHR.Pointer> {
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

            public Array(VkDisplayPresentInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayPresentInfoKHR.Pointer get(int i){
                return new VkDisplayPresentInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
