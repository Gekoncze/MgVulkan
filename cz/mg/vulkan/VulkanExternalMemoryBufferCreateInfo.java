package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryBufferCreateInfo.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryBufferCreateInfo extends VulkanObject {
    public VulkanExternalMemoryBufferCreateInfo(){
        super(new VkExternalMemoryBufferCreateInfo());
    }

    public VulkanExternalMemoryBufferCreateInfo(VkExternalMemoryBufferCreateInfo vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryBufferCreateInfo getVk(){
        return (VkExternalMemoryBufferCreateInfo) super.getVk();
    }
    public VulkanExternalMemoryBufferCreateInfo(VulkanObject pNext, VulkanExternalMemoryHandleTypeFlags handleTypes) {
        super(new VkExternalMemoryBufferCreateInfo(pNext.getVk(), handleTypes.getVk()));
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

    public VulkanExternalMemoryHandleTypeFlags getHandleTypes() {
        return new VulkanExternalMemoryHandleTypeFlags(getVk().getHandleTypes());
    }

    public void setHandleTypes(VulkanExternalMemoryHandleTypeFlags handleTypes) {
        getVk().setHandleTypes(handleTypes.getVk());
    }


    public static class Array extends VulkanExternalMemoryBufferCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryBufferCreateInfo> {
        public Array(VkExternalMemoryBufferCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryBufferCreateInfo.Array(count));
        }

        public Array(int count, VulkanExternalMemoryBufferCreateInfo o){
            this(new VkExternalMemoryBufferCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryBufferCreateInfo.Array getVk(){
            return (VkExternalMemoryBufferCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryBufferCreateInfo get(int i){
            return new VulkanExternalMemoryBufferCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryBufferCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryBufferCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryBufferCreateInfo.Pointer(value));
        }

        @Override
        public VkExternalMemoryBufferCreateInfo.Pointer getVk(){
            return (VkExternalMemoryBufferCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryBufferCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryBufferCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryBufferCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryBufferCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryBufferCreateInfo.Pointer.Array getVk(){
                return (VkExternalMemoryBufferCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryBufferCreateInfo.Pointer get(int i){
                return new VulkanExternalMemoryBufferCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
