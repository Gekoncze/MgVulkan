package cz.mg.vulkan;

public class PFNvkTrimCommandPool extends VkFunctionPointer {
    public PFNvkTrimCommandPool() {
    }

    public PFNvkTrimCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkTrimCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkTrimCommandPool(long value) {
        setValue(value);
    }

    public PFNvkTrimCommandPool(VkInstance instance) {
        super(instance, new VkString("vkTrimCommandPool"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
    }

    protected static native void call(long vkaddress, long device, long commandPool, long flags);
}
