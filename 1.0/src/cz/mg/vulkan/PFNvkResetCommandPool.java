package cz.mg.vulkan;

public class PFNvkResetCommandPool extends VkFunctionPointer {
    public PFNvkResetCommandPool() {
    }

    protected PFNvkResetCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkResetCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkResetCommandPool(long value) {
        setValue(value);
    }

    public PFNvkResetCommandPool(VkInstance instance) {
        super(instance, new VkString("vkResetCommandPool"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkCommandPoolResetFlags flags, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long commandPool, long flags, long rval);
}
