package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkTextureLODGatherFormatPropertiesAMD.html">khronos documentation</a>
 **/
public class VulkanTextureLODGatherFormatPropertiesAMD extends VulkanObject {
    public VulkanTextureLODGatherFormatPropertiesAMD(){
        super(new VkTextureLODGatherFormatPropertiesAMD());
    }

    public VulkanTextureLODGatherFormatPropertiesAMD(VkTextureLODGatherFormatPropertiesAMD vk){
        super(vk);
    }

    @Override
    public VkTextureLODGatherFormatPropertiesAMD getVk(){
        return (VkTextureLODGatherFormatPropertiesAMD) super.getVk();
    }

    public VulkanTextureLODGatherFormatPropertiesAMD(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 supportsTextureGatherLODBiasAMD) {
        super(new VkTextureLODGatherFormatPropertiesAMD(sType.getVk(), pNext.getVk(), supportsTextureGatherLODBiasAMD.getVk()));
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

    public VulkanBool32 getSupportsTextureGatherLODBiasAMD() {
        return new VulkanBool32(getVk().getSupportsTextureGatherLODBiasAMD());
    }

    public void setSupportsTextureGatherLODBiasAMD(VulkanBool32 supportsTextureGatherLODBiasAMD) {
        getVk().setSupportsTextureGatherLODBiasAMD(supportsTextureGatherLODBiasAMD.getVk());
    }


    public static class Array extends VulkanTextureLODGatherFormatPropertiesAMD implements cz.mg.collections.array.ReadonlyArray<VulkanTextureLODGatherFormatPropertiesAMD> {
        public Array(VkTextureLODGatherFormatPropertiesAMD.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkTextureLODGatherFormatPropertiesAMD.Array(count));
        }

        public Array(int count, VulkanTextureLODGatherFormatPropertiesAMD o){
            this(new VkTextureLODGatherFormatPropertiesAMD.Array(count, o.getVk()));
        }

        @Override
        public VkTextureLODGatherFormatPropertiesAMD.Array getVk(){
            return (VkTextureLODGatherFormatPropertiesAMD.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanTextureLODGatherFormatPropertiesAMD get(int i){
            return new VulkanTextureLODGatherFormatPropertiesAMD(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkTextureLODGatherFormatPropertiesAMD.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkTextureLODGatherFormatPropertiesAMD.Pointer());
        }

        public Pointer(long value) {
            this(new VkTextureLODGatherFormatPropertiesAMD.Pointer(value));
        }

        @Override
        public VkTextureLODGatherFormatPropertiesAMD.Pointer getVk(){
            return (VkTextureLODGatherFormatPropertiesAMD.Pointer) super.getVk();
        }

        public static class Array extends VulkanTextureLODGatherFormatPropertiesAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanTextureLODGatherFormatPropertiesAMD.Pointer> {
            public Array(int count) {
                super(new VkTextureLODGatherFormatPropertiesAMD.Pointer.Array(count));
            }

            public Array(VulkanTextureLODGatherFormatPropertiesAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkTextureLODGatherFormatPropertiesAMD.Pointer.Array getVk(){
                return (VkTextureLODGatherFormatPropertiesAMD.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanTextureLODGatherFormatPropertiesAMD.Pointer get(int i){
                return new VulkanTextureLODGatherFormatPropertiesAMD.Pointer(getVk().get(i));
            }
        }
    }
}
