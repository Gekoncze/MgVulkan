package cz.mg.vulkan;

public class PFNvkTrimCommandPoolKHR extends VkFunctionPointer {
    public PFNvkTrimCommandPoolKHR() {
    }

    protected PFNvkTrimCommandPoolKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkTrimCommandPoolKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkTrimCommandPoolKHR(long value) {
        setValue(value);
    }

    public PFNvkTrimCommandPoolKHR(VkInstance instance) {
        super(instance, new VkString("vkTrimCommandPoolKHR"));
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
