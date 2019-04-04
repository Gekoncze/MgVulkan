package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerCreateInfo.html">khronos documentation</a>
 **/
public class VulkanSamplerCreateInfo extends VulkanObject {
    public VulkanSamplerCreateInfo(){
        super(new VkSamplerCreateInfo());
    }

    public VulkanSamplerCreateInfo(VkSamplerCreateInfo vk){
        super(vk);
    }

    @Override
    public VkSamplerCreateInfo getVk(){
        return (VkSamplerCreateInfo) super.getVk();
    }
    public VulkanSamplerCreateInfo(VulkanObject pNext, VulkanSamplerCreateFlags flags, VulkanFilter magFilter, VulkanFilter minFilter, VulkanSamplerMipmapMode mipmapMode, VulkanSamplerAddressMode addressModeU, VulkanSamplerAddressMode addressModeV, VulkanSamplerAddressMode addressModeW, VulkanFloat mipLodBias, VulkanBool32 anisotropyEnable, VulkanFloat maxAnisotropy, VulkanBool32 compareEnable, VulkanCompareOp compareOp, VulkanFloat minLod, VulkanFloat maxLod, VulkanBorderColor borderColor, VulkanBool32 unnormalizedCoordinates) {
        super(new VkSamplerCreateInfo(pNext.getVk(), flags.getVk(), magFilter.getVk(), minFilter.getVk(), mipmapMode.getVk(), addressModeU.getVk(), addressModeV.getVk(), addressModeW.getVk(), mipLodBias.getVk(), anisotropyEnable.getVk(), maxAnisotropy.getVk(), compareEnable.getVk(), compareOp.getVk(), minLod.getVk(), maxLod.getVk(), borderColor.getVk(), unnormalizedCoordinates.getVk()));
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

    public VulkanSamplerCreateFlags getFlags() {
        return new VulkanSamplerCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanSamplerCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanFilter getMagFilter() {
        return new VulkanFilter(getVk().getMagFilter());
    }

    public void setMagFilter(VulkanFilter magFilter) {
        getVk().setMagFilter(magFilter.getVk());
    }

    public VulkanFilter getMinFilter() {
        return new VulkanFilter(getVk().getMinFilter());
    }

    public void setMinFilter(VulkanFilter minFilter) {
        getVk().setMinFilter(minFilter.getVk());
    }

    public VulkanSamplerMipmapMode getMipmapMode() {
        return new VulkanSamplerMipmapMode(getVk().getMipmapMode());
    }

    public void setMipmapMode(VulkanSamplerMipmapMode mipmapMode) {
        getVk().setMipmapMode(mipmapMode.getVk());
    }

    public VulkanSamplerAddressMode getAddressModeU() {
        return new VulkanSamplerAddressMode(getVk().getAddressModeU());
    }

    public void setAddressModeU(VulkanSamplerAddressMode addressModeU) {
        getVk().setAddressModeU(addressModeU.getVk());
    }

    public VulkanSamplerAddressMode getAddressModeV() {
        return new VulkanSamplerAddressMode(getVk().getAddressModeV());
    }

    public void setAddressModeV(VulkanSamplerAddressMode addressModeV) {
        getVk().setAddressModeV(addressModeV.getVk());
    }

    public VulkanSamplerAddressMode getAddressModeW() {
        return new VulkanSamplerAddressMode(getVk().getAddressModeW());
    }

    public void setAddressModeW(VulkanSamplerAddressMode addressModeW) {
        getVk().setAddressModeW(addressModeW.getVk());
    }

    public VulkanFloat getMipLodBias() {
        return new VulkanFloat(getVk().getMipLodBias());
    }

    public void setMipLodBias(VulkanFloat mipLodBias) {
        getVk().setMipLodBias(mipLodBias.getVk());
    }

    public VulkanBool32 getAnisotropyEnable() {
        return new VulkanBool32(getVk().getAnisotropyEnable());
    }

    public void setAnisotropyEnable(VulkanBool32 anisotropyEnable) {
        getVk().setAnisotropyEnable(anisotropyEnable.getVk());
    }

    public VulkanFloat getMaxAnisotropy() {
        return new VulkanFloat(getVk().getMaxAnisotropy());
    }

    public void setMaxAnisotropy(VulkanFloat maxAnisotropy) {
        getVk().setMaxAnisotropy(maxAnisotropy.getVk());
    }

    public VulkanBool32 getCompareEnable() {
        return new VulkanBool32(getVk().getCompareEnable());
    }

    public void setCompareEnable(VulkanBool32 compareEnable) {
        getVk().setCompareEnable(compareEnable.getVk());
    }

    public VulkanCompareOp getCompareOp() {
        return new VulkanCompareOp(getVk().getCompareOp());
    }

    public void setCompareOp(VulkanCompareOp compareOp) {
        getVk().setCompareOp(compareOp.getVk());
    }

    public VulkanFloat getMinLod() {
        return new VulkanFloat(getVk().getMinLod());
    }

    public void setMinLod(VulkanFloat minLod) {
        getVk().setMinLod(minLod.getVk());
    }

    public VulkanFloat getMaxLod() {
        return new VulkanFloat(getVk().getMaxLod());
    }

    public void setMaxLod(VulkanFloat maxLod) {
        getVk().setMaxLod(maxLod.getVk());
    }

    public VulkanBorderColor getBorderColor() {
        return new VulkanBorderColor(getVk().getBorderColor());
    }

    public void setBorderColor(VulkanBorderColor borderColor) {
        getVk().setBorderColor(borderColor.getVk());
    }

    public VulkanBool32 getUnnormalizedCoordinates() {
        return new VulkanBool32(getVk().getUnnormalizedCoordinates());
    }

    public void setUnnormalizedCoordinates(VulkanBool32 unnormalizedCoordinates) {
        getVk().setUnnormalizedCoordinates(unnormalizedCoordinates.getVk());
    }


    public static class Array extends VulkanSamplerCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerCreateInfo> {
        public Array(VkSamplerCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerCreateInfo.Array(count));
        }

        public Array(int count, VulkanSamplerCreateInfo o){
            this(new VkSamplerCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerCreateInfo.Array getVk(){
            return (VkSamplerCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerCreateInfo get(int i){
            return new VulkanSamplerCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerCreateInfo.Pointer(value));
        }

        @Override
        public VkSamplerCreateInfo.Pointer getVk(){
            return (VkSamplerCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkSamplerCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanSamplerCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerCreateInfo.Pointer.Array getVk(){
                return (VkSamplerCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerCreateInfo.Pointer get(int i){
                return new VulkanSamplerCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
