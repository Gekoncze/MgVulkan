package cz.mg.vulkan;

public class PFNvkCreateFence extends VkFunctionPointer {
    public PFNvkCreateFence() {
    }

    protected PFNvkCreateFence(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateFence(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateFence(long value) {
        setValue(value);
    }

    public PFNvkCreateFence(VkInstance instance) {
        super(instance, new VkString("vkCreateFence"));
    }

    public int call(VkDevice device, VkFenceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pFence);

}
