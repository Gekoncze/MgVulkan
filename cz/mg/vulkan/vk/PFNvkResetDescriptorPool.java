package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long descriptorPool, long flags, long rval);
}
