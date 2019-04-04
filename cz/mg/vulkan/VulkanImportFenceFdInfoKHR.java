package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImportFenceFdInfoKHR.html">khronos documentation</a>
 **/
public class VulkanImportFenceFdInfoKHR extends VulkanObject {
    public VulkanImportFenceFdInfoKHR(){
        super(new VkImportFenceFdInfoKHR());
    }

    public VulkanImportFenceFdInfoKHR(VkImportFenceFdInfoKHR vk){
        super(vk);
    }

    @Override
    public VkImportFenceFdInfoKHR getVk(){
        return (VkImportFenceFdInfoKHR) super.getVk();
    }
    public VulkanImportFenceFdInfoKHR(VulkanObject pNext, VulkanFence fence, VulkanFenceImportFlags flags, VulkanExternalFenceHandleTypeFlagBits handleType, VulkanInt fd) {
        super(new VkImportFenceFdInfoKHR(pNext.getVk(), fence.getVk(), flags.getVk(), handleType.getVk(), fd.getVk()));
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

    public VulkanFence getFence() {
        return new VulkanFence(getVk().getFence());
    }

    public void setFence(VulkanFence fence) {
        getVk().setFence(fence.getVk());
    }

    public VulkanFenceImportFlags getFlags() {
        return new VulkanFenceImportFlags(getVk().getFlags());
    }

    public void setFlags(VulkanFenceImportFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanExternalFenceHandleTypeFlagBits getHandleType() {
        return new VulkanExternalFenceHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalFenceHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }

    public VulkanInt getFd() {
        return new VulkanInt(getVk().getFd());
    }

    public void setFd(VulkanInt fd) {
        getVk().setFd(fd.getVk());
    }


    public static class Array extends VulkanImportFenceFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanImportFenceFdInfoKHR> {
        public Array(VkImportFenceFdInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImportFenceFdInfoKHR.Array(count));
        }

        public Array(int count, VulkanImportFenceFdInfoKHR o){
            this(new VkImportFenceFdInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkImportFenceFdInfoKHR.Array getVk(){
            return (VkImportFenceFdInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImportFenceFdInfoKHR get(int i){
            return new VulkanImportFenceFdInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImportFenceFdInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImportFenceFdInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkImportFenceFdInfoKHR.Pointer(value));
        }

        @Override
        public VkImportFenceFdInfoKHR.Pointer getVk(){
            return (VkImportFenceFdInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanImportFenceFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImportFenceFdInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkImportFenceFdInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanImportFenceFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImportFenceFdInfoKHR.Pointer.Array getVk(){
                return (VkImportFenceFdInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImportFenceFdInfoKHR.Pointer get(int i){
                return new VulkanImportFenceFdInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
