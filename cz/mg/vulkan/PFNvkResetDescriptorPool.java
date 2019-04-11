package cz.mg.vulkan;

public class PFNvkResetDescriptorPool extends VkFunctionPointer {
    public PFNvkResetDescriptorPool() {
    }

    public PFNvkResetDescriptorPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkResetDescriptorPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkResetDescriptorPool(long value) {
        setValue(value);
    }

    public PFNvkResetDescriptorPool(VkInstance instance) {
        super(instance, new VkString("vkResetDescriptorPool"));
    }

    public void call(VkDevice device, VkDescriptorPool descriptorPool, VkDescriptorPoolResetFlags flags, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress(), rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long descriptorPool, long flags, long rval);
}
