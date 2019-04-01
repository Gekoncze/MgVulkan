package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkQueueInsertDebugUtilsLabelEXT.html">khronos documentation</a>
 **/
public class PFNvkQueueInsertDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkQueueInsertDebugUtilsLabelEXT() {
    }

    public PFNvkQueueInsertDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueueInsertDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkQueueInsertDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkQueueInsertDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkQueueInsertDebugUtilsLabelEXT"));
    }

    public void call(VkQueue queue, VkDebugUtilsLabelEXT pLabelInfo){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.NULL_ADDRESS, pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long queue, long pLabelInfo);
}
