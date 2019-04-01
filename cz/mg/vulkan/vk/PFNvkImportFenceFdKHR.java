package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkImportFenceFdKHR.html">khronos documentation</a>
 **/
public class PFNvkImportFenceFdKHR extends VkFunctionPointer {
    public PFNvkImportFenceFdKHR() {
    }

    public PFNvkImportFenceFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkImportFenceFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkImportFenceFdKHR(long value) {
        setValue(value);
    }

    public PFNvkImportFenceFdKHR(VkInstance instance) {
        super(instance, new VkString("vkImportFenceFdKHR"));
    }

    public void call(VkDevice device, VkImportFenceFdInfoKHR pImportFenceFdInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pImportFenceFdInfo != null ? pImportFenceFdInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pImportFenceFdInfo, long rval);
}
