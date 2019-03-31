package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubmitInfo.html">khronos documentation</a>
 **/
public class VkSubmitInfo extends VkObject {
    public VkSubmitInfo() {
        super(sizeof());
    }

    public VkSubmitInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSubmitInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSubmitInfo(VkObject pNext, VkUInt32 waitSemaphoreCount, VkSemaphore pWaitSemaphores, VkPipelineStageFlags pWaitDstStageMask, VkUInt32 commandBufferCount, VkCommandBuffer pCommandBuffers, VkUInt32 signalSemaphoreCount, VkSemaphore pSignalSemaphores) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SUBMIT_INFO));
        setPNext(pNext);
        setWaitSemaphoreCount(waitSemaphoreCount);
        setPWaitSemaphores(pWaitSemaphores);
        setPWaitDstStageMask(pWaitDstStageMask);
        setCommandBufferCount(commandBufferCount);
        setPCommandBuffers(pCommandBuffers);
        setSignalSemaphoreCount(signalSemaphoreCount);
        setPSignalSemaphores(pSignalSemaphores);
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

    public VkSemaphore.Array getPWaitSemaphores() {
        return new VkSemaphore.Array(getVkMemory(), getPWaitSemaphores(getVkAddress()), getWaitSemaphoreCount().getValue());
    }

    public void setPWaitSemaphores(VkSemaphore pWaitSemaphores) {
        setPWaitSemaphores(getVkAddress(), pWaitSemaphores.getVkAddress());
    }

    private static native long getPWaitSemaphores(long address);
    private static native void setPWaitSemaphores(long address, long pWaitSemaphores);

    public VkPipelineStageFlags getPWaitDstStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getPWaitDstStageMask(getVkAddress()));
    }

    public void setPWaitDstStageMask(VkPipelineStageFlags pWaitDstStageMask) {
        setPWaitDstStageMask(getVkAddress(), pWaitDstStageMask.getVkAddress());
    }

    private static native long getPWaitDstStageMask(long address);
    private static native void setPWaitDstStageMask(long address, long pWaitDstStageMask);

    public VkUInt32 getCommandBufferCount() {
        return new VkUInt32(getVkMemory(), getCommandBufferCount(getVkAddress()));
    }

    public void setCommandBufferCount(VkUInt32 commandBufferCount) {
        setCommandBufferCount(getVkAddress(), commandBufferCount.getVkAddress());
    }

    private static native long getCommandBufferCount(long address);
    private static native void setCommandBufferCount(long address, long commandBufferCount);

    public VkCommandBuffer.Array getPCommandBuffers() {
        return new VkCommandBuffer.Array(getVkMemory(), getPCommandBuffers(getVkAddress()), getCommandBufferCount().getValue());
    }

    public void setPCommandBuffers(VkCommandBuffer pCommandBuffers) {
        setPCommandBuffers(getVkAddress(), pCommandBuffers.getVkAddress());
    }

    private static native long getPCommandBuffers(long address);
    private static native void setPCommandBuffers(long address, long pCommandBuffers);

    public VkUInt32 getSignalSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getSignalSemaphoreCount(getVkAddress()));
    }

    public void setSignalSemaphoreCount(VkUInt32 signalSemaphoreCount) {
        setSignalSemaphoreCount(getVkAddress(), signalSemaphoreCount.getVkAddress());
    }

    private static native long getSignalSemaphoreCount(long address);
    private static native void setSignalSemaphoreCount(long address, long signalSemaphoreCount);

    public VkSemaphore.Array getPSignalSemaphores() {
        return new VkSemaphore.Array(getVkMemory(), getPSignalSemaphores(getVkAddress()), getSignalSemaphoreCount().getValue());
    }

    public void setPSignalSemaphores(VkSemaphore pSignalSemaphores) {
        setPSignalSemaphores(getVkAddress(), pSignalSemaphores.getVkAddress());
    }

    private static native long getPSignalSemaphores(long address);
    private static native void setPSignalSemaphores(long address, long pSignalSemaphores);


    public static native long sizeof();

    public static class Array extends VkSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VkSubmitInfo> {
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
        public VkSubmitInfo get(int i){
            return new VkSubmitInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkSubmitInfo[] a) {
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
