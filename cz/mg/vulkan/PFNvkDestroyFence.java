package cz.mg.vulkan;

public class PFNvkDestroyFence extends VkFunctionPointer {
    public PFNvkDestroyFence() {
    }

    public PFNvkDestroyFence(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyFence(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyFence(long value) {
        setValue(value);
    }

    public PFNvkDestroyFence(VkInstance instance) {
        super(instance, new VkString("vkDestroyFence"));
    }

    public void call(VkDevice device, VkFence fence, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), fence != null ? fence.getVkAddress() : VkPointer.getSinkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long fence, long pAllocator);
}
