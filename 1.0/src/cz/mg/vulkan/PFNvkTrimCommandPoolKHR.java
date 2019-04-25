package cz.mg.vulkan;

public class PFNvkTrimCommandPoolKHR extends VkFunctionPointer {
    public PFNvkTrimCommandPoolKHR() {
    }

    public PFNvkTrimCommandPoolKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkTrimCommandPoolKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkTrimCommandPoolKHR(long value) {
        setValue(value);
    }

    public PFNvkTrimCommandPoolKHR(VkInstance instance) {
        super(instance, new VkString("vkTrimCommandPoolKHR"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlagsKHR flags){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long device, long commandPool, long flags);
}
