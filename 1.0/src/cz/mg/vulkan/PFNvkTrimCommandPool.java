package cz.mg.vulkan;

public class PFNvkTrimCommandPool extends VkFunctionPointer {
    public PFNvkTrimCommandPool() {
    }

    protected PFNvkTrimCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkTrimCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkTrimCommandPool(long value) {
        setValue(value);
    }

    public PFNvkTrimCommandPool(VkInstance instance) {
        super(instance, new VkString("vkTrimCommandPool"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long commandPool, long flags);


    public void call(VkDevice device, VkCommandPool commandPool, int flags){
        callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddressNative(), flags);
    }

    protected static native void callSimplifiedNative(long vkaddress, long device, long commandPool, int flags);

}
