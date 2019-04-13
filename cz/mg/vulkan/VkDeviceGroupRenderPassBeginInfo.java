package cz.mg.vulkan;

public class VkDeviceGroupRenderPassBeginInfo extends VkObject {
    public VkDeviceGroupRenderPassBeginInfo() {
        super(sizeof());
    }

    public VkDeviceGroupRenderPassBeginInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupRenderPassBeginInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupRenderPassBeginInfo(VkObject pNext, VkUInt32 deviceMask, VkUInt32 deviceRenderAreaCount, VkRect2D pDeviceRenderAreas) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO));
        setPNext(pNext);
        setDeviceMask(deviceMask);
        setDeviceRenderAreaCount(deviceRenderAreaCount);
        setPDeviceRenderAreas(pDeviceRenderAreas);
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

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMask(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMask(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDeviceMask(long address);
    private static native void setDeviceMask(long address, long deviceMask);

    public VkUInt32 getDeviceRenderAreaCount() {
        return new VkUInt32(getVkMemory(), getDeviceRenderAreaCount(getVkAddress()));
    }

    
    public void setDeviceRenderAreaCount(VkUInt32 deviceRenderAreaCount) {
        setDeviceRenderAreaCount(getVkAddress(), deviceRenderAreaCount != null ? deviceRenderAreaCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDeviceRenderAreaCount(long address);
    private static native void setDeviceRenderAreaCount(long address, long deviceRenderAreaCount);

    public VkRect2D getPDeviceRenderAreas() {
        return new VkRect2D(getVkMemory(), getPDeviceRenderAreas(getVkAddress()));
    }

    private VkObject pDeviceRenderAreas = null;
    public void setPDeviceRenderAreas(VkRect2D pDeviceRenderAreas) {
        setPDeviceRenderAreas(getVkAddress(), pDeviceRenderAreas != null ? pDeviceRenderAreas.getVkAddress() : VkPointer.NULL);
        this.pDeviceRenderAreas = pDeviceRenderAreas;
    }

    private static native long getPDeviceRenderAreas(long address);
    private static native void setPDeviceRenderAreas(long address, long pDeviceRenderAreas);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupRenderPassBeginInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupRenderPassBeginInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupRenderPassBeginInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGroupRenderPassBeginInfo o){
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
        public VkDeviceGroupRenderPassBeginInfo get(int i){
            return new VkDeviceGroupRenderPassBeginInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGroupRenderPassBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupRenderPassBeginInfo.Pointer> {
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

            public Array(VkDeviceGroupRenderPassBeginInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupRenderPassBeginInfo.Pointer get(int i){
                return new VkDeviceGroupRenderPassBeginInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
