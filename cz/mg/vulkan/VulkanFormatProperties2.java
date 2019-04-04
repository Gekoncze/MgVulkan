package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormatProperties2.html">khronos documentation</a>
 **/
public class VulkanFormatProperties2 extends VulkanObject {
    public VulkanFormatProperties2(){
        super(new VkFormatProperties2());
    }

    public VulkanFormatProperties2(VkFormatProperties2 vk){
        super(vk);
    }

    @Override
    public VkFormatProperties2 getVk(){
        return (VkFormatProperties2) super.getVk();
    }

    public VulkanFormatProperties2(VulkanStructureType sType, VulkanObject pNext, VulkanFormatProperties formatProperties) {
        super(new VkFormatProperties2(sType.getVk(), pNext.getVk(), formatProperties.getVk()));
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

    public VulkanFormatProperties getFormatProperties() {
        return new VulkanFormatProperties(getVk().getFormatProperties());
    }

    public void setFormatProperties(VulkanFormatProperties formatProperties) {
        getVk().setFormatProperties(formatProperties.getVk());
    }


    public static class Array extends VulkanFormatProperties2 implements cz.mg.collections.array.ReadonlyArray<VulkanFormatProperties2> {
        public Array(VkFormatProperties2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFormatProperties2.Array(count));
        }

        public Array(int count, VulkanFormatProperties2 o){
            this(new VkFormatProperties2.Array(count, o.getVk()));
        }

        @Override
        public VkFormatProperties2.Array getVk(){
            return (VkFormatProperties2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFormatProperties2 get(int i){
            return new VulkanFormatProperties2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFormatProperties2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFormatProperties2.Pointer());
        }

        public Pointer(long value) {
            this(new VkFormatProperties2.Pointer(value));
        }

        @Override
        public VkFormatProperties2.Pointer getVk(){
            return (VkFormatProperties2.Pointer) super.getVk();
        }

        public static class Array extends VulkanFormatProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFormatProperties2.Pointer> {
            public Array(int count) {
                super(new VkFormatProperties2.Pointer.Array(count));
            }

            public Array(VulkanFormatProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFormatProperties2.Pointer.Array getVk(){
                return (VkFormatProperties2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFormatProperties2.Pointer get(int i){
                return new VulkanFormatProperties2.Pointer(getVk().get(i));
            }
        }
    }
}
