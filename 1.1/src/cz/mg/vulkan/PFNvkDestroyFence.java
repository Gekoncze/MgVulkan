package cz.mg.vulkan;

public class PFNvkDestroyFence extends VkFunctionPointer {
    public PFNvkDestroyFence() {
    }

    protected PFNvkDestroyFence(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyFence(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyFence(long value) {
        setValue(value);
    }

    public PFNvkDestroyFence(VkInstance instance) {
        super(instance, new VkString("vkDestroyFence"));
    }

    public void call(VkDevice device, VkFence fence, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), fence != null ? fence.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long fence, long pAllocator);

}
