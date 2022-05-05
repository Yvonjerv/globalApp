package impl;

import mapperImpl.TAddressMapperImpl;
import model.TAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private TAddressMapperImpl tAddressMapper;

    @Override
    public int deleteAddress(Integer addressid) {
        return tAddressMapper.deleteByPrimaryKey(addressid);
    }

    @Override
    public List<TAddress> getAddresssSelective(TAddress record) {
        return tAddressMapper.selectBySelective(record);    }

    @Override
    public int insertAddress(TAddress record) {
        return tAddressMapper.insertSelective(record);
    }

    @Override
    public TAddress selectAddressById(Integer addressid) {
        return tAddressMapper.selectByPrimaryKey(addressid);
    }

    @Override
    public int updateAddress(TAddress record) {
        return tAddressMapper.updateByPrimaryKeySelective(record);
    }
}
