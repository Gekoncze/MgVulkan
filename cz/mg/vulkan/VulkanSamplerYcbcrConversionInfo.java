package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerYcbcrConversionInfo.html">khronos documentation</a>
 **/
public class VulkanSamplerYcbcrConversionInfo extends VulkanObject {
    public VulkanSamplerYcbcrConversionInfo(){
        super(new VkSamplerYcbcrConversionInfo());
    }

    public VulkanSamplerYcbcrConversionInfo(VkSamplerYcbcrConversionInfo vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrConversionInfo getVk(){
        return (VkSamplerYcbcrConversionInfo) super.getVk();
    }
    public VulkanSamplerYcbcrConversionInfo(VulkanObject pNext, VulkanSamplerYcbcrConversion conversion) {
        super(new VkSamplerYcbcrConversionInfo(pNext.getVk(), conversion.getVk()));
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

    public VulkanSamplerYcbcrConversion getConversion() {
        return new VulkanSamplerYcbcrConversion(getVk().getConversion());
    }

    public void setConversion(VulkanSamplerYcbcrConversion conversion) {
        getVk().setConversion(conversion.getVk());
    }


    public static class Array extends VulkanSamplerYcbcrConversionInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversionInfo> {
        public Array(VkSamplerYcbcrConversionInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerYcbcrConversionInfo.Array(count));
        }

        public Array(int count, VulkanSamplerYcbcrConversionInfo o){
            this(new VkSamplerYcbcrConversionInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerYcbcrConversionInfo.Array getVk(){
            return (VkSamplerYcbcrConversionInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerYcbcrConversionInfo get(int i){
            return new VulkanSamplerYcbcrConversionInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerYcbcrConversionInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerYcbcrConversionInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerYcbcrConversionInfo.Pointer(value));
        }

        @Override
        public VkSamplerYcbcrConversionInfo.Pointer getVk(){
            return (VkSamplerYcbcrConversionInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerYcbcrConversionInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversionInfo.Pointer> {
            public Array(int count) {
                super(new VkSamplerYcbcrConversionInfo.Pointer.Array(count));
            }

            public Array(VulkanSamplerYcbcrConversionInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerYcbcrConversionInfo.Pointer.Array getVk(){
                return (VkSamplerYcbcrConversionInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerYcbcrConversionInfo.Pointer get(int i){
                return new VulkanSamplerYcbcrConversionInfo.Pointer(getVk().get(i));
            }
        }
    }
}
