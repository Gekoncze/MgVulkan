package cz.mg.vulkan;

public class VkImagePlaneMemoryRequirementsInfo extends VkObject {
    public VkImagePlaneMemoryRequirementsInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO));
    }

    public VkImagePlaneMemoryRequirementsInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImagePlaneMemoryRequirementsInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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
        setPlaneAspect(getVkAddress(), planeAspect != null ? planeAspect.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPlaneAspect(long address);
    private static native void setPlaneAspect(long address, long planeAspect);


    public static native long sizeof();

    public static class Array extends VkImagePlaneMemoryRequirementsInfo implements cz.mg.collections.array.ReadonlyArray<VkImagePlaneMemoryRequirementsInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImagePlaneMemoryRequirementsInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImagePlaneMemoryRequirementsInfo o){
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
        public VkImagePlaneMemoryRequirementsInfo get(int i){
            return new VkImagePlaneMemoryRequirementsInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImagePlaneMemoryRequirementsInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImagePlaneMemoryRequirementsInfo.Pointer> {
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

            public Array(VkImagePlaneMemoryRequirementsInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImagePlaneMemoryRequirementsInfo.Pointer get(int i){
                return new VkImagePlaneMemoryRequirementsInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
