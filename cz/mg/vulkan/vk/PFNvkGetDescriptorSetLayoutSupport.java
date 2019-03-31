package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDescriptorSetLayoutSupport.html">khronos documentation</a>
 **/
public class PFNvkGetDescriptorSetLayoutSupport extends VkFunctionPointer {
    public PFNvkGetDescriptorSetLayoutSupport() {
    }

    public PFNvkGetDescriptorSetLayoutSupport(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDescriptorSetLayoutSupport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetDescriptorSetLayoutSupport(long value) {
        setValue(value);
    }

    public PFNvkGetDescriptorSetLayoutSupport(VkInstance instance) {
        super(instance, new VkString("vkGetDescriptorSetLayoutSupport"));
    }

    public void call(VkDevice device, VkDescriptorSetLayoutCreateInfo pCreateInfo, VkDescriptorSetLayoutSupport pSupport){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pSupport != null ? pSupport.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pSupport);
}
