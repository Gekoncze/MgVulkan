package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupSubmitInfo.html">khronos documentation</a>
 **/
public class VkDeviceGroupSubmitInfo extends VkObject {
    public VkDeviceGroupSubmitInfo() {
        super(sizeof());
    }

    public VkDeviceGroupSubmitInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDeviceGroupSubmitInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDeviceGroupSubmitInfo(VkObject pNext, VkUInt32 waitSemaphoreCount, VkUInt32 pWaitSemaphoreDeviceIndices, VkUInt32 commandBufferCount, VkUInt32 pCommandBufferDeviceMasks, VkUInt32 signalSemaphoreCount, VkUInt32 pSignalSemaphoreDeviceIndices) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO));
        setPNext(pNext);
        setWaitSemaphoreCount(waitSemaphoreCount);
        setPWaitSemaphoreDeviceIndices(pWaitSemaphoreDeviceIndices);
        setCommandBufferCount(commandBufferCount);
        setPCommandBufferDeviceMasks(pCommandBufferDeviceMasks);
        setSignalSemaphoreCount(signalSemaphoreCount);
        setPSignalSemaphoreDeviceIndices(pSignalSemaphoreDeviceIndices);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getWaitSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getWaitSemaphoreCount(getVkAddress()));
    }

    public void setWaitSemaphoreCount(VkUInt32 waitSemaphoreCount) {
        setWaitSemaphoreCount(getVkAddress(), waitSemaphoreCount.getVkAddress());
    }

    private static native long getWaitSemaphoreCount(long address);
    private static native void setWaitSemaphoreCount(long address, long waitSemaphoreCount);

    public VkUInt32.Array getPWaitSemaphoreDeviceIndices() {
        return new VkUInt32.Array(getVkMemory(), getPWaitSemaphoreDeviceIndices(getVkAddress()), getWaitSemaphoreCount().getValue());
    }

    public void setPWaitSemaphoreDeviceIndices(VkUInt32 pWaitSemaphoreDeviceIndices) {
        setPWaitSemaphoreDeviceIndices(getVkAddress(), pWaitSemaphoreDeviceIndices.getVkAddress());
    }

    private static native long getPWaitSemaphoreDeviceIndices(long address);
    private static native void setPWaitSemaphoreDeviceIndices(long address, long pWaitSemaphoreDeviceIndices);

    public VkUInt32 getCommandBufferCount() {
        return new VkUInt32(getVkMemory(), getCommandBufferCount(getVkAddress()));
    }

    public void setCommandBufferCount(VkUInt32 commandBufferCount) {
        setCommandBufferCount(getVkAddress(), commandBufferCount.getVkAddress());
    }

    private static native long getCommandBufferCount(long address);
    private static native void setCommandBufferCount(long address, long commandBufferCount);

    public VkUInt32.Array getPCommandBufferDeviceMasks() {
        return new VkUInt32.Array(getVkMemory(), getPCommandBufferDeviceMasks(getVkAddress()), getCommandBufferCount().getValue());
    }

    public void setPCommandBufferDeviceMasks(VkUInt32 pCommandBufferDeviceMasks) {
        setPCommandBufferDeviceMasks(getVkAddress(), pCommandBufferDeviceMasks.getVkAddress());
    }

    private static native long getPCommandBufferDeviceMasks(long address);
    private static native void setPCommandBufferDeviceMasks(long address, long pCommandBufferDeviceMasks);

    public VkUInt32 getSignalSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getSignalSemaphoreCount(getVkAddress()));
    }

    public void setSignalSemaphoreCount(VkUInt32 signalSemaphoreCount) {
        setSignalSemaphoreCount(getVkAddress(), signalSemaphoreCount.getVkAddress());
    }

    private static native long getSignalSemaphoreCount(long address);
    private static native void setSignalSemaphoreCount(long address, long signalSemaphoreCount);

    public VkUInt32.Array getPSignalSemaphoreDeviceIndices() {
        return new VkUInt32.Array(getVkMemory(), getPSignalSemaphoreDeviceIndices(getVkAddress()), getSignalSemaphoreCount().getValue());
    }

    public void setPSignalSemaphoreDeviceIndices(VkUInt32 pSignalSemaphoreDeviceIndices) {
        setPSignalSemaphoreDeviceIndices(getVkAddress(), pSignalSemaphoreDeviceIndices.getVkAddress());
    }

    private static native long getPSignalSemaphoreDeviceIndices(long address);
    private static native void setPSignalSemaphoreDeviceIndices(long address, long pSignalSemaphoreDeviceIndices);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupSubmitInfo> {
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
        public VkDeviceGroupSubmitInfo get(int i){
            return new VkDeviceGroupSubmitInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkDeviceGroupSubmitInfo[] a) {
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
