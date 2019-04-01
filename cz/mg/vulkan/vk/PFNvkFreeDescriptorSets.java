package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFreeDescriptorSets.html">khronos documentation</a>
 **/
public class PFNvkFreeDescriptorSets extends VkFunctionPointer {
    public PFNvkFreeDescriptorSets() {
    }

    public PFNvkFreeDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkFreeDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkFreeDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkFreeDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkFreeDescriptorSets"));
    }

    public void call(VkDevice device, VkDescriptorPool descriptorPool, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.NULL_ADDRESS, pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long descriptorPool, long descriptorSetCount, long pDescriptorSets, long rval);
}
