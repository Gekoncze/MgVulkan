package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheCreateInfoEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCacheCreateInfoEXT extends VulkanObject {
    public VulkanValidationCacheCreateInfoEXT(){
        super(new VkValidationCacheCreateInfoEXT());
    }

    public VulkanValidationCacheCreateInfoEXT(VkValidationCacheCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCacheCreateInfoEXT getVk(){
        return (VkValidationCacheCreateInfoEXT) super.getVk();
    }
    public VulkanValidationCacheCreateInfoEXT(VulkanObject pNext, VulkanValidationCacheCreateFlagsEXT flags, VulkanSize initialDataSize, VulkanObject pInitialData) {
        super(new VkValidationCacheCreateInfoEXT(pNext.getVk(), flags.getVk(), initialDataSize.getVk(), pInitialData.getVk()));
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

    public VulkanValidationCacheCreateFlagsEXT getFlags() {
        return new VulkanValidationCacheCreateFlagsEXT(getVk().getFlags());
    }

    public void setFlags(VulkanValidationCacheCreateFlagsEXT flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanSize getInitialDataSize() {
        return new VulkanSize(getVk().getInitialDataSize());
    }

    public void setInitialDataSize(VulkanSize initialDataSize) {
        getVk().setInitialDataSize(initialDataSize.getVk());
    }

    public VulkanObject getPInitialData() {
        return new VulkanObject(getVk().getPInitialData());
    }

    public void setPInitialData(VulkanObject pInitialData) {
        getVk().setPInitialData(pInitialData.getVk());
    }


    public static class Array extends VulkanValidationCacheCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheCreateInfoEXT> {
        public Array(VkValidationCacheCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkValidationCacheCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanValidationCacheCreateInfoEXT o){
            this(new VkValidationCacheCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkValidationCacheCreateInfoEXT.Array getVk(){
            return (VkValidationCacheCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanValidationCacheCreateInfoEXT get(int i){
            return new VulkanValidationCacheCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkValidationCacheCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkValidationCacheCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkValidationCacheCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkValidationCacheCreateInfoEXT.Pointer getVk(){
            return (VkValidationCacheCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanValidationCacheCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkValidationCacheCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanValidationCacheCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkValidationCacheCreateInfoEXT.Pointer.Array getVk(){
                return (VkValidationCacheCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanValidationCacheCreateInfoEXT.Pointer get(int i){
                return new VulkanValidationCacheCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
