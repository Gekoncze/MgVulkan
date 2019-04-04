package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderModuleValidationCacheCreateInfoEXT.html">khronos documentation</a>
 **/
public class VulkanShaderModuleValidationCacheCreateInfoEXT extends VulkanObject {
    public VulkanShaderModuleValidationCacheCreateInfoEXT(){
        super(new VkShaderModuleValidationCacheCreateInfoEXT());
    }

    public VulkanShaderModuleValidationCacheCreateInfoEXT(VkShaderModuleValidationCacheCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkShaderModuleValidationCacheCreateInfoEXT getVk(){
        return (VkShaderModuleValidationCacheCreateInfoEXT) super.getVk();
    }
    public VulkanShaderModuleValidationCacheCreateInfoEXT(VulkanObject pNext, VulkanValidationCacheEXT validationCache) {
        super(new VkShaderModuleValidationCacheCreateInfoEXT(pNext.getVk(), validationCache.getVk()));
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

    public VulkanValidationCacheEXT getValidationCache() {
        return new VulkanValidationCacheEXT(getVk().getValidationCache());
    }

    public void setValidationCache(VulkanValidationCacheEXT validationCache) {
        getVk().setValidationCache(validationCache.getVk());
    }


    public static class Array extends VulkanShaderModuleValidationCacheCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModuleValidationCacheCreateInfoEXT> {
        public Array(VkShaderModuleValidationCacheCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderModuleValidationCacheCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanShaderModuleValidationCacheCreateInfoEXT o){
            this(new VkShaderModuleValidationCacheCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkShaderModuleValidationCacheCreateInfoEXT.Array getVk(){
            return (VkShaderModuleValidationCacheCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderModuleValidationCacheCreateInfoEXT get(int i){
            return new VulkanShaderModuleValidationCacheCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderModuleValidationCacheCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderModuleValidationCacheCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderModuleValidationCacheCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkShaderModuleValidationCacheCreateInfoEXT.Pointer getVk(){
            return (VkShaderModuleValidationCacheCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderModuleValidationCacheCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModuleValidationCacheCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkShaderModuleValidationCacheCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanShaderModuleValidationCacheCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderModuleValidationCacheCreateInfoEXT.Pointer.Array getVk(){
                return (VkShaderModuleValidationCacheCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderModuleValidationCacheCreateInfoEXT.Pointer get(int i){
                return new VulkanShaderModuleValidationCacheCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
