package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetDescriptorPool.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), descriptorPool != null ? descriptorPool.getVkAddress() : VkDescriptorPool.NULL.getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorPool, long flags, long rval);
}
