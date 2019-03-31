package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkTrimCommandPoolKHR.html">khronos documentation</a>
 **/
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

    public void call(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), commandPool != null ? commandPool.getVkAddress() : VkCommandPool.NULL.getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long commandPool, long flags);
}
