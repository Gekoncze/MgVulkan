package cz.mg.vulkan;

public class VkImagePlaneMemoryRequirementsInfoKHR extends VkObject {
    public VkImagePlaneMemoryRequirementsInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO_KHR));
    }

    public VkImagePlaneMemoryRequirementsInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImagePlaneMemoryRequirementsInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
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

    public VkImageAspectFlagBits getPlaneAspect() {
        return new VkImageAspectFlagBits(getVkMemory(), getPlaneAspect(getVkAddress()));
    }

    
    public void setPlaneAspect(VkImageAspectFlagBits planeAspect) {
        setPlaneAspect(getVkAddress(), planeAspect != null ? planeAspect.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPlaneAspectQ() {
        return getPlaneAspect().getValue();
    }

    public void setPlaneAspect(int planeAspect) {
        getPlaneAspect().setValue(planeAspect);
    }

    private static native long getPlaneAspect(long address);
    private static native void setPlaneAspect(long address, long planeAspect);


    public static native long sizeof();

    public static class Array extends VkImagePlaneMemoryRequirementsInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImagePlaneMemoryRequirementsInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImagePlaneMemoryRequirementsInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImagePlaneMemoryRequirementsInfoKHR o){
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
        public VkImagePlaneMemoryRequirementsInfoKHR get(int i){
            return new VkImagePlaneMemoryRequirementsInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImagePlaneMemoryRequirementsInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImagePlaneMemoryRequirementsInfoKHR.Pointer> {
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

            public Array(VkImagePlaneMemoryRequirementsInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImagePlaneMemoryRequirementsInfoKHR.Pointer get(int i){
                return new VkImagePlaneMemoryRequirementsInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
