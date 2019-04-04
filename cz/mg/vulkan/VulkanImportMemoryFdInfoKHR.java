package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImportMemoryFdInfoKHR.html">khronos documentation</a>
 **/
public class VulkanImportMemoryFdInfoKHR extends VulkanObject {
    public VulkanImportMemoryFdInfoKHR(){
        super(new VkImportMemoryFdInfoKHR());
    }

    public VulkanImportMemoryFdInfoKHR(VkImportMemoryFdInfoKHR vk){
        super(vk);
    }

    @Override
    public VkImportMemoryFdInfoKHR getVk(){
        return (VkImportMemoryFdInfoKHR) super.getVk();
    }
    public VulkanImportMemoryFdInfoKHR(VulkanObject pNext, VulkanExternalMemoryHandleTypeFlagBits handleType, VulkanInt fd) {
        super(new VkImportMemoryFdInfoKHR(pNext.getVk(), handleType.getVk(), fd.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VulkanExternalMemoryHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalMemoryHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }

    public VulkanInt getFd() {
        return new VulkanInt(getVk().getFd());
    }

    public void setFd(VulkanInt fd) {
        getVk().setFd(fd.getVk());
    }


    public static class Array extends VulkanImportMemoryFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanImportMemoryFdInfoKHR> {
        public Array(VkImportMemoryFdInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImportMemoryFdInfoKHR.Array(count));
        }

        public Array(int count, VulkanImportMemoryFdInfoKHR o){
            this(new VkImportMemoryFdInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkImportMemoryFdInfoKHR.Array getVk(){
            return (VkImportMemoryFdInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImportMemoryFdInfoKHR get(int i){
            return new VulkanImportMemoryFdInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImportMemoryFdInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImportMemoryFdInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkImportMemoryFdInfoKHR.Pointer(value));
        }

        @Override
        public VkImportMemoryFdInfoKHR.Pointer getVk(){
            return (VkImportMemoryFdInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanImportMemoryFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImportMemoryFdInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkImportMemoryFdInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanImportMemoryFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImportMemoryFdInfoKHR.Pointer.Array getVk(){
                return (VkImportMemoryFdInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImportMemoryFdInfoKHR.Pointer get(int i){
                return new VulkanImportMemoryFdInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
