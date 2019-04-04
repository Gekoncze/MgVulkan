package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMultisamplePropertiesEXT.html">khronos documentation</a>
 **/
public class VulkanMultisamplePropertiesEXT extends VulkanObject {
    public VulkanMultisamplePropertiesEXT(){
        super(new VkMultisamplePropertiesEXT());
    }

    public VulkanMultisamplePropertiesEXT(VkMultisamplePropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkMultisamplePropertiesEXT getVk(){
        return (VkMultisamplePropertiesEXT) super.getVk();
    }

    public VulkanMultisamplePropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanExtent2D maxSampleLocationGridSize) {
        super(new VkMultisamplePropertiesEXT(sType.getVk(), pNext.getVk(), maxSampleLocationGridSize.getVk()));
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

    public VulkanExtent2D getMaxSampleLocationGridSize() {
        return new VulkanExtent2D(getVk().getMaxSampleLocationGridSize());
    }

    public void setMaxSampleLocationGridSize(VulkanExtent2D maxSampleLocationGridSize) {
        getVk().setMaxSampleLocationGridSize(maxSampleLocationGridSize.getVk());
    }


    public static class Array extends VulkanMultisamplePropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanMultisamplePropertiesEXT> {
        public Array(VkMultisamplePropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMultisamplePropertiesEXT.Array(count));
        }

        public Array(int count, VulkanMultisamplePropertiesEXT o){
            this(new VkMultisamplePropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkMultisamplePropertiesEXT.Array getVk(){
            return (VkMultisamplePropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMultisamplePropertiesEXT get(int i){
            return new VulkanMultisamplePropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMultisamplePropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMultisamplePropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkMultisamplePropertiesEXT.Pointer(value));
        }

        @Override
        public VkMultisamplePropertiesEXT.Pointer getVk(){
            return (VkMultisamplePropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanMultisamplePropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMultisamplePropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkMultisamplePropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanMultisamplePropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMultisamplePropertiesEXT.Pointer.Array getVk(){
                return (VkMultisamplePropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMultisamplePropertiesEXT.Pointer get(int i){
                return new VulkanMultisamplePropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
