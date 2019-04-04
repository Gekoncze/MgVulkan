package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryImageCreateInfoNV.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryImageCreateInfoNV extends VulkanObject {
    public VulkanExternalMemoryImageCreateInfoNV(){
        super(new VkExternalMemoryImageCreateInfoNV());
    }

    public VulkanExternalMemoryImageCreateInfoNV(VkExternalMemoryImageCreateInfoNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryImageCreateInfoNV getVk(){
        return (VkExternalMemoryImageCreateInfoNV) super.getVk();
    }
    public VulkanExternalMemoryImageCreateInfoNV(VulkanObject pNext, VulkanExternalMemoryHandleTypeFlagsNV handleTypes) {
        super(new VkExternalMemoryImageCreateInfoNV(pNext.getVk(), handleTypes.getVk()));
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

    public VulkanExternalMemoryHandleTypeFlagsNV getHandleTypes() {
        return new VulkanExternalMemoryHandleTypeFlagsNV(getVk().getHandleTypes());
    }

    public void setHandleTypes(VulkanExternalMemoryHandleTypeFlagsNV handleTypes) {
        getVk().setHandleTypes(handleTypes.getVk());
    }


    public static class Array extends VulkanExternalMemoryImageCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryImageCreateInfoNV> {
        public Array(VkExternalMemoryImageCreateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryImageCreateInfoNV.Array(count));
        }

        public Array(int count, VulkanExternalMemoryImageCreateInfoNV o){
            this(new VkExternalMemoryImageCreateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryImageCreateInfoNV.Array getVk(){
            return (VkExternalMemoryImageCreateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryImageCreateInfoNV get(int i){
            return new VulkanExternalMemoryImageCreateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryImageCreateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryImageCreateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryImageCreateInfoNV.Pointer(value));
        }

        @Override
        public VkExternalMemoryImageCreateInfoNV.Pointer getVk(){
            return (VkExternalMemoryImageCreateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryImageCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryImageCreateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryImageCreateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryImageCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryImageCreateInfoNV.Pointer.Array getVk(){
                return (VkExternalMemoryImageCreateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryImageCreateInfoNV.Pointer get(int i){
                return new VulkanExternalMemoryImageCreateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}
